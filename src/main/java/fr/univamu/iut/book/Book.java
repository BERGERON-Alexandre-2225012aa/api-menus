package fr.univamu.iut.book;

public class Book {
    private String reference;
    private String auteurs;
    private String titre;
    private char status; //valeur possible : "d" "r" et "e" pour disponible, réservé et empreinté

    public Book(String reference, String auteurs, String titre) {
        this.reference = reference;
        this.auteurs = auteurs;
        this.titre = titre;
        status = 'd';
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "reference='" + reference + '\'' +
                ", auteurs='" + auteurs + '\'' +
                ", titre='" + titre + '\'' +
                ", status=" + status +
                '}';
    }
}
