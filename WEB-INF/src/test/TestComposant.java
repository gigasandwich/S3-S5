package test;

import dao.ComposantDao;
import modele.Composant;

import java.util.List;

public class TestComposant {
    /*
     * Tsy nisy table composant fa nalefako ihany aloha ito satria tao @ modele ozy lah
     */
    public static void main(String[] args) {
        ComposantDao composantDao = new ComposantDao();

        // Insert
        // Composant newComposant = new Composant(4, "Dell", "XPS", "Intel i7", "16GB", 512.0f, "Laptop");
        // composantDao.insert(newComposant);
        // System.out.println("Inserted new composant: " + newComposant.getMarque());

        // Select
        List<Composant> composants = composantDao.selectAll();
        System.out.println("All composants:");
        for (Composant composant : composants) {
            System.out.println(composant.getMarque() + " - " + composant.getModele());
        }

        // Select by id
        Composant selectedComposant = composantDao.select(3);
        if (selectedComposant != null) {
            System.out.println("Selected composant: " + selectedComposant.getMarque() + " - " + selectedComposant.getModele());
        } else {
            System.out.println("Composant not found.");
        }

        // Update
        // Composant updatedComposant = new Composant(3, "HP", "Spectre", "Intel i9", "32GB", 1024.0f, "Laptop");
        // composantDao.update(selectedComposant, updatedComposant);
        // System.out.println("Updated composant: " + updatedComposant.getMarque());

        // Delete
        // composantDao.delete(3);
        // System.out.println("Deleted composant with ID 3");
    }
}
