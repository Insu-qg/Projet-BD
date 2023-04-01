package fr.uga.l3miage.photonum.data.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

// ajout model pour heritage
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name= "type")
//@DiscriminatorValue(name= "impression")
public class Impression {

    // ---- Attributs ----

    @Column(name = "idImpression")
    @Id
    @GeneratedValue
    private Long idImpression; // remplacer par String si besoin

    @ManyToMany(mappedBy = "impressions")
    Set<Client> clients;

    /**
     * @return Long return the idImpression
     */
    public Long getIdImpression() {
        return idImpression;
    }

    /**
     * @param idImpression the idImpression to set
     */
    public void setIdImpression(Long idImpression) {
        this.idImpression = idImpression;
    }

    /**
     * @return  return thes clients
     */
    public Set<Client> getClients() {
        return clients;
    }

    /**
     * @param 
     */
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        if (this.clients == null) {
            this.clients = new HashSet<>();
        }
        this.clients.add(client);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Impression impression = (Impression) o;
        return idImpression == impression.idImpression ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImpression);
    }

}
