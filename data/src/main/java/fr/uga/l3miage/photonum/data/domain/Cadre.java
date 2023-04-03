package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cadre")
public class Cadre extends Impression {

   @Column(name = "mise_en_forme")
   private String miseEnForme;

   @ManyToMany
   private List<Photo> photoDecadre;
   
   public String getMiseEnForme() {
      return miseEnForme;
   }

   public void setMiseEnForme(String miseEnForme) {
      this.miseEnForme = miseEnForme;
   }

}
