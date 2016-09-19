/**
 * Created by vadimcastro on 9/15/16.
 */

//Vadim Castro
// Weapon class

public class Weapon extends Item {
    private String name ;
    private int weight;
    private int damage;
    private int cost;

    public Weapon(String n, int w, int d, int c) {
        super();
        name = n;
        weight = w;
        damage = d;
        cost = c;
    }

    // returns int value of damage field

    public int getDamage() {
        return damage;
    }

    // returns int value of cost field

    public int getCost() {
        return cost;
    }

    // prints name, weight, damage, and cost fields

    public void examine() {
        System.out.println("\nName: " + name + "\nWeight: " + weight + " pounds" + "\nDamage: " + damage + " HP" + "\nCost: " + cost + " NeoBytes");
    }
}

