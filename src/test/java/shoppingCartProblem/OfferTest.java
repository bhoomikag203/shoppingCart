package shoppingCartProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OfferTest {

    @Test
    public void shouldOfferFivePercentDiscount() throws Exception {
        Offer offer = new Offer();
        Apple apple = new Apple("apple", 10, 2);
        Milk milk = new Milk("milk", 20, 10);
        offer.cart.addItem(apple);
        offer.cart.addItem(milk);
        double finalAmount = offer.fivePercentDiscount();

        Assert.assertEquals(finalAmount, 209.0);
    }

    @Test
    public void shouldOfferMilkForEveryTwoMilk() throws Exception {
        Offer offer = new Offer();
        Apple apple = new Apple("apple", 10, 2);
        Milk milk = new Milk("milk", 20, 10);
        offer.cart.addItem(apple);
        offer.cart.addItem(milk);

        offer.buyTwoMilkGetOneFree();

        Assert.assertEquals(offer.cart.totalItemCount(), 17);
    }

}