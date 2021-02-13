package JakCart;

import java.util.ArrayList;
import JakCart.ProductItem.*;

public class Order
{
    /*Method returning total price of all items
    The method take an ArrayList as parameter ...
    ... and return a Double (the total price of all items in the ArrayList */
    public static Double totalPrice(ArrayList<ProductItem> products) {

        Double totalPriceOfAllItems = 0.00; // initialize the variable to return

        /*
         * Iterate through each "object" item of the products list passed to the method
         * Perform a total price calculation for the item and increment the result to
         * the "totalPriceOfAllItems
         */
        for (ProductItem item : products) {
            totalPriceOfAllItems += ProductItem.totalPrice(item);
        }
        return totalPriceOfAllItems;
    }

    public static void main(String[] args) {
        // Create several instances of ProductItem
        ProductItem item1 = new ProductItem("Milk", 1.50, 2);
        ProductItem item2 = new ProductItem("Flour", 10.25, 1);
        ProductItem item3 = new ProductItem("Sugar", 3.00, 2);
        ProductItem item4 = new ProductItem("Butter", 1.50, 2);
        ProductItem item5 = new ProductItem("Egg", 5.30, 2);
        ProductItem item6 = new ProductItem("Oil", 3.10, 1);
        ProductItem item7 = new ProductItem("Aroma", 1.99, 2);

        // Add the items created to an ArrayList
        ArrayList<ProductItem> myProducts = new ArrayList<ProductItem>();
        myProducts.add(item1);
        myProducts.add(item2);
        myProducts.add(item3);
        myProducts.add(item4);
        myProducts.add(item5);
        myProducts.add(item6);
        myProducts.add(item7);

        // Call the method to return the total price of all items in the ArrayList
        System.out.println(Order.totalPrice(myProducts));
    }
}
