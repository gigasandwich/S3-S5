package modele; 

public class Ordinateur {
    // Idem comme pour client
    int idOrdinateur;
    String numeroSerie;
    int idClient;
    int idRam;
    int idProcesseur;
    int idTypeOrdinateur;
    int idModele;
    float stockage;

    public Ordinateur(int idOrdinateur, String numeroSerie, int idClient, int idRam, int idProcesseur, int idTypeOrdinateur, int idModele, float stockage) {
        this.idOrdinateur = idOrdinateur;
        this.numeroSerie = numeroSerie;
        this.idClient = idClient;
        this.idRam = idRam;
        this.idProcesseur = idProcesseur;
        this.idTypeOrdinateur = idTypeOrdinateur;
        this.idModele = idModele;
        this.stockage = stockage;
    }
}
