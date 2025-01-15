package modele; 

import java.util.Date;

public class Reparation {
    // Crud pour id seulement
    int idReparation;
    String descriptionSolution;
    Date dateDepot;
    Date dateRetour;
    float coutReparation;
    String statutReparation;
    int idTechnicien;
    int idProbleme;

    public Reparation(int idReparation, String descriptionSolution, Date dateDepot, Date dateRetour, float coutReparation, String statutReparation, int idTechnicien, int idProbleme) {
        this.idReparation = idReparation;
        this.descriptionSolution = descriptionSolution;
        this.dateDepot = dateDepot;
        this.dateRetour = dateRetour;
        this.coutReparation = coutReparation;
        this.statutReparation = statutReparation;
        this.idTechnicien = idTechnicien;
        this.idProbleme = idProbleme;
    }
}
