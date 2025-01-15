package modele;

public class Composant {
    String marque;
    String modele;
    String processeur;
    String ram;
    float stockage;
    String typeOrdinateur;

    public Composant(String marque, String modele, String processeur, String ram, float stockage, String typeOrdinateur) {
        this.marque = marque;
        this.modele = modele;
        this.processeur = processeur;
        this.ram = ram;
        this.stockage = stockage;
        this.typeOrdinateur = typeOrdinateur;
    }
}
