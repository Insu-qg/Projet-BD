package fr.uga.l3miage.photonum.data.domain;

public enum Etat {
    LIVRE,
    ENCOURS;

    private  String status;
    

    /**
     * @return String return the valeur
     */
    public String getSatus() {
        return status;
    }

    

}
