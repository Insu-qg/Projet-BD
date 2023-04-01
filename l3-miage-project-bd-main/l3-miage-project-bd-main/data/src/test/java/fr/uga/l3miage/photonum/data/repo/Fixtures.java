package fr.uga.l3miage.photonum.data.repo;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;

import fr.uga.l3miage.photonum.data.domain.Album;
import fr.uga.l3miage.photonum.data.domain.Cadre;
import fr.uga.l3miage.photonum.data.domain.Calendrier;
import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.data.domain.Tirage;

import java.util.Random;

public class Fixtures {

    private static final Faker FAKER = Faker.instance(new Random(42));

    public static Impression newImpression() {
        Impression impression = new Impression();
        return impression;
    }

    public static Client newClient(){
        Client client = new Client();
        client.setAdresseMail(FAKER.internet().emailAddress());
        client.setNom(FAKER.name().lastName());
        client.setPrenom(FAKER.name().firstName());
        client.setMotDePasse(FAKER.internet().password());
        return client;
    }

    public static Commande newCommande(){
        Commande commande = new Commande();
        commande.setDateCommande(FAKER.date().birthday());
        return commande;
    }

    public static Image newImage(Client client){
        Image image = new Image();
        image.setInfoPriseDeVue(FAKER.address().cityName());
        image.setChemin(FAKER.internet().image());
        image.setShare(FAKER.bool().bool());
        image.setProprietaire(client);
        image.setResolution(FAKER.number().randomNumber());
        return image;
    }

    public static Tirage newTirage(){
        Tirage tirage = new Tirage();
        return tirage;
    }

    public static Album newAlbum(){
        Album album = new Album();
        album.setTitreCouverture(FAKER.zelda().game());
        return album;
    }

    public static Cadre newCadre(){
        Cadre cadre = new Cadre();
        cadre.setMiseEnPage("mise en page : ...");
        return cadre;
    }

    public static Calendrier newCalendrier(){
        Calendrier calendrier = new Calendrier();
        calendrier.setAnnee(FAKER.number().randomDigit());
        return calendrier;
    }
}
