/**
 * Created by vadimcastro on 9/15/16.
 */

// Vadim Castro
// Armor class

public class Armor extends Item {
    private String name;
    private int weight;
    private int defense;
    private int cost;

    public Armor(String n, int w, int d, int c) {
        super();
        name = n;
        weight = w;
        defense = d;
        cost = c;
    }

    // returns int value of defense field

    public int getDefense() {
        return defense;
    }

    // returns int value of cost field

    public int getCost() {
        return cost;
    }

    // prints name, weight, defense, and cost fields

    public void examine() {
        System.out.println("\nName: " + name + "\nWeight: " + weight + " pounds" + "\nDefense: " + defense + "\nCost: " + cost + " NeoBytes");
    }
}
