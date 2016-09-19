//Vadim Castro
// Food Class --> sub class of Item

public class Food extends Item {
    private String name;
    private int weight;
    private int nutrition;
    private int quantity;
    private int cost;


    Food(String n, int w, int nut , int q, int c){
        super();
        name = n;
        weight = w;
        nutrition = nut;
        quantity = q;
        cost = c;
    }

    // returns int value of quantity field

    public int getQuantity() {
        return quantity;
    }

    // sets the quantity field

    public void setQuality(int x) {
        quantity = x;
    }

    // returns int value of nutrition field

    public int getNutrition() {
        return nutrition;
    }

    // returns int value of cost field

    public int getCost() {
        return cost;
    }

    // prints name, weight, nutrition, quantity, and cost fields

    public void examine() {
        System.out.println("\nName: " + name + "\nWeight: " + weight + " pounds" + "\nNutrition Rating: " + nutrition + "/10" + "\nQuantity: " + quantity + "\nCost: " + cost + " NeoBytes");
    }
}