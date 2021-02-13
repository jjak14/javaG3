package JakCart;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldReturn10()
    {
        //create an instance of the ProductItem and pass parameters to the resulting object
        ProductItem testItem = new ProductItem("milk", 2.00, 5);

        /*call the method totalPrice of the class ProductItem on the created object
        And store the result in "testResult" */
        Double testResult = ProductItem.totalPrice(testItem);

        //assert that the value of "testResult is 10.00"
        assertEquals(10.00, testResult, 0.00);
    }

    @Test
    public void shouldReturn20()
    {
        //Create instances of ProductItem
        ProductItem obj1 = new ProductItem("item1", 2.00, 5);
        ProductItem obj2 = new ProductItem("item1", 5.00, 2);

        //Create a list of the above product items
        ArrayList<ProductItem> testList = new ArrayList<ProductItem>();
        testList.add(obj1);
        testList.add(obj2);

        /*call the method Order.totalPrice on the created list*/
        Double testPriceOfItems = Order.totalPrice(testList);

        //assert that the value of "testResult is 20.00"
        assertEquals(20.00, testPriceOfItems, 0.00);
    }
}
