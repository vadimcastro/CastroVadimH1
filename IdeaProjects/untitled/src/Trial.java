// Vadim Castro
// Trial Class: tests all subclasses and respective methods 

import javax.swing.JOptionPane;

public class Trial {
    public static void main(String[] args){

        boolean flagger = true;


        // displays 6 option menu for user

        while (flagger == true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to The Gild"
                    + "\n\nPlease select the item you would like to forge : "
                    +  "\n1.Weapon \n2.Armor \n3.Food \n4.Potion \n5.Wallet \n6.Exit"));

            // switch statement for user's respective choice

            switch(option) {
                case 1:
                    String name = JOptionPane.showInputDialog("Enter a nickname for your weapon: ");
                    int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter the weight of " + name));
                    int damage = Integer.parseInt(JOptionPane.showInputDialog("Enter the damage " + name + " will deliver"));
                    int cost = weight * 4;

                    Weapon one = new Weapon(name,weight,damage,cost);
                    one.examine();
                    flagger = false;
                    break;

                case 2:
                    String name2 = JOptionPane.showInputDialog("Enter a nickname for your protection: ");
                    int weight2 = Integer.parseInt(JOptionPane.showInputDialog("How much does " + name2 + " weigh?"));
                    int defense = Integer.parseInt(JOptionPane.showInputDialog("How much protection does " + name2 + " offer?"));
                    int cost2 = weight2 * 3;

                    Armor two = new Armor(name2, weight2, defense, cost2);
                    two.examine();
                    flagger = false;
                    break;

                case 3:
                    String name3 = JOptionPane.showInputDialog("What kind of dish are you cooking?");
                    int weight3 = Integer.parseInt(JOptionPane.showInputDialog("How many pounds is your dish?"));
                    int nutrition = Integer.parseInt(JOptionPane.showInputDialog("What is the nutritioanl rating out of 10?"));
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog("How many dishes are you preparing?"));
                    int cost3 = weight3 * quantity * 2;

                    Food three = new Food(name3,weight3,nutrition,quantity,cost3);
                    three.examine();
                    flagger = false;
                    break;

                case 4:
                    String name4 = JOptionPane.showInputDialog("What are you calling this potion?");
                    int damage2 = Integer.parseInt(JOptionPane.showInputDialog("How much damage will your potion deliver?"));
                    int cost4 = damage2 * 5;

                    Potion four = new Potion(name4,damage2,cost4);
                    four.examine();
                    flagger = false;
                    break;

                case 5:
                    String name5 = JOptionPane.showInputDialog("What is the name of your new wallet?");
                    String material = JOptionPane.showInputDialog("What material will you be using?");
                    int coins = Integer.parseInt(JOptionPane.showInputDialog("How many coins will " + name5 + " carry?"));
                    int bal = Integer.parseInt(JOptionPane.showInputDialog("What is the total value of your coins?"));

                    Wallet five = new Wallet(name5,material,coins,bal);
                    five.examine();
                    flagger = false;
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,"See you soon!");
                    flagger = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Invalid option: please try again and follow directions");
                    flagger = true;
                    break;


            }




    }
}
}