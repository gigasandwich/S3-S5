package modele; 

public class Probleme {
    // Idem comme pour client
    int idProbleme;
    String descriptionProbleme;
    String categorieProbleme;

    public Probleme(int idProbleme, String descriptionProbleme, String categorieProbleme) {
        this.idProbleme = idProbleme;
        this.descriptionProbleme = descriptionProbleme;
        this.categorieProbleme = categorieProbleme;
    }
}