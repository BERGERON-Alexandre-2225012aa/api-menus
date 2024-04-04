package fr.univamu.iut.commande.domaine;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;

public class Menu {
    private String nom;
    private JsonArray plats;
    private String createur;
    private String date;
    private String prix;

    public Menu(String nom, JsonArray plats, String createur, String date, String prix) {
        this.nom = nom;
        this.plats = plats;
        this.createur = createur;
        this.date = date;
        this.prix = prix;
    }
    public static Menu create(String nom, JsonArray plats, String createur, String date, String prix){
        return new Menu(nom, plats, createur, date, prix);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public JsonArray getPlats() {
        return plats;
    }

    public void setPlats(JsonArray plats) {
        this.plats = plats;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
    public JsonObject getJSON(){
        return Json.createObjectBuilder()
                .add("nomMenu", this.nom)
                .add("contenu", this.plats)
                .add("createur",this.createur)
                .add("prix",this.prix)
                .add("date",this.date)
                .build();
    }
}
