// Vadim Castro
// Wallet class --> subclass of Item

public class Wallet extends Item {
    private String name;
    private String material;
    private int balance;
    private int weight ;


    public Wallet(String n, String m, int NoC, int bal ) {
        super();
        name = n;
        material = m;
        weight = (NoC) / 16;
        balance = bal;
    }

    // returns int value of balance field

    public int getBalance() {
        return balance;
    }

    // sets the value for balance field

    public void setBalance(int x){
        balance = x;
    }


    // prints name, material, weight, and balance fields

    public void examine() {
        System.out.println("\nName: " + name + "\nMaterial: " + material + "\nWeight: " + weight + " pounds" + "\nBalance: " + balance + " NeoBytes");
    }
}