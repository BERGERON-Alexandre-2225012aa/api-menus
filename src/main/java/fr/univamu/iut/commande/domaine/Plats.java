package fr.univamu.iut.commande.domaine;

public class Plats {
    private String nom;
    private String prix;

    public Plats(String nom, String prix) {
        this.nom = nom;
        this.prix = prix;
    }
    public static Plats create(String nom, String prix){
        return new Plats(nom,prix);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
