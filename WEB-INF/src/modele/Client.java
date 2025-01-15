package modele; 

public class Client {
    int id;
    String nom;
    String contact;

    public Client(int id, String nom, String contact) {
        this.id = id;
        this.nom = nom;
        this.contact = contact;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getContact() {
        return contact;
    }
}
