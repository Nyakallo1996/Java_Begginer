
package ex_05_2;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Nyakallo Mahlakametsa";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] items = {"Shirt","Socks","Scarf","Belt"};

        // Change message to show the number of items purchased.
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);

        // Print an element from the items array.

        System.out.println(items[2]);
        //System.out.println(items[4]);
    }
    
}
