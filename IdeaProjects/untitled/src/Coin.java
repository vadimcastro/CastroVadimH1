// Vadim Castro
// Coin class --> subclass of Item

public class Coin extends Item {
    private String name;
    private final int weight = 1 ;
    private int value;

    public Coin(String n, int v){
        super();
        name = n;
        value = v;
    }

    // returns int value of value field

    public int getValue(){
        return value;
    }

    // prints name and value fields

    public void examine() {
        System.out.println("\nName: " + name + "Value: " + value + " NeoBytes");
    }
}