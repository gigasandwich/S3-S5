package modele;

public class Composant {
    private String marque;
    private String modele;
    private String processeur;
    private String ram;
    private float stockage;
    private String typeOrdinateur;

    public Composant(String marque, String modele, String processeur, String ram, float stockage, String typeOrdinateur) {
        this.marque = marque;
        this.modele = modele;
        this.processeur = processeur;
        this.ram = ram;
        this.stockage = stockage;
        this.typeOrdinateur = typeOrdinateur;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getProcesseur() {
        return processeur;
    }

    public String getRam() {
        return ram;
    }

    public float getStockage() {
        return stockage;
    }

    public String getTypeOrdinateur() {
        return typeOrdinateur;
    }
}
