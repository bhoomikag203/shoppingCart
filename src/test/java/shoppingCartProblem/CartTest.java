package shoppingCartProblem;

import org.junit.Test;
import org.testng.Assert;
import shoppingCartProblem.Apple;
import shoppingCartProblem.Cart;
import shoppingCartProblem.NewsPaper;

public class CartTest {

    @Test
    public void shouldGetItemcount() {
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 10, 10);
        NewsPaper newsPaper = new NewsPaper("newspaper",  (float)5.0, 3);
        Milk milk = new Milk("milk", 20, 1 );

        cart.addItem(apple);
        cart.addItem(newsPaper);
        cart.addItem(milk);

        int itemCount = cart.totalItemCount();
        Assert.assertEquals(itemCount, 14);
    }

    @Test
    public void shouldComputeTotalPrice() {
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 10, 10);
        Milk milk = new Milk("milk", 20, 2);
        NewsPaper newsPaper = new NewsPaper("newspaper", 5, 3);

        cart.addItem(apple);
        cart.addItem(newsPaper);
        cart.addItem(milk);

        double totalPrice = cart.computeTotalPrice();
        Assert.assertEquals(totalPrice, 155.0);

    }
}
