// Vadim Castro
// Potion Class --> subclass of Item

public class Potion extends Item {
    private String name;
    private final int weight = 1;
    private int damage;
    private int cost;

    public Potion(String n, int d, int c){
        super();
        name = n;
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
        System.out.println("\nName: " + name + "\nWeight: " + weight + " pound" + "\nDamage: " + damage + " HP" + "\nCost: " + cost + " NeoBytes");
    }
}
