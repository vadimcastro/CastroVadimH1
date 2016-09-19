/**
 * Created by vadimcastro on 9/15/16.
 */

// Vadim Castro
// Item superclass

public class Item {

    private String name; // holds name of item
    private int weight; // holds weight of item

    public Item() {
        name = null;
        weight = 0;
    }

    public String getName() { //returns the string value of name field
        return name;
    }

    public int getWeight() { //returns int value of weight field
        return weight;
    }

    public void examine() { // prints name and weight of item
        System.out.println("Name: " + name + "Weight: " + weight);
    }
}
