package JakCart;

//This is the class I'm writing
public class ProductItem 
{
    //Declare the properties of the objects in this class
    String prodName;
    Double prodPrice;
    int prodQty;

    //Initialize objects of the class with 3 parameters (constructor)
    ProductItem(String name, Double price, int qty) {
        this.prodName = name;
        this.prodPrice = price;
        this.prodQty = qty;
    }

    /*
    Below a method that takes an object as parameter
    then perform a calculation on 2 parameters of the object
    and return the result
    */
    public static Double totalPrice(ProductItem testItem) {
        Double productTotalPrice = testItem.prodPrice * testItem.prodQty;
        return productTotalPrice;
    }
}
