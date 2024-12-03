package game;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    // --- Attributs. ---
    private String name;
    private final List<Key> keys;
    public Backpack backpack;  // Remplacer la liste d'items par un Backpack

    // --- Getters. ---
    public String getName() {
        return name;
    }
    public List<Key> getKeys() {
        return keys;
    }
    public Backpack getBackpack() {
        return backpack;  // Retourner l'objet Backpack
    }

    // --- Setters. ---
    public void setName(String name) {
        this.name = name;
    }

    // --- Constructeur. ---
    public Hero() {
        this.name = "Generic";
        this.keys = new ArrayList<>();
        this.backpack = new Backpack();  // Initialisation du sac à dos
    }

    // --- Méthodes. ---

    // Ajouter un item au backpack
    public void addItem(Item item) {
        backpack.addItem(item);
    }

    // Retirer un item du backpack
    public void removeItem(Item item) {
        backpack.removeItem(item);
    }

    // Afficher l'inventaire (les items dans le backpack)
    public void showInventory() {
        backpack.showItems();
    }
}
