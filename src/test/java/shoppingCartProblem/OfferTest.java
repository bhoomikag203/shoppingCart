package shoppingCartProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OfferTest {

    @Test
    public void shouldOfferFivePercentDiscount() throws Exception {
        Offer offer = new Offer();
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 10, 2);
        Milk milk = new Milk("milk", 20, 10);
        cart.addItem(apple);
        cart.addItem(milk);
        cart.computeTotalPrice();

        Assert.assertEquals(offer.fivePercentDiscount(cart), 11.0);
    }

    @Test
    public void shouldBeAbleToGetDiscountAmountAfterBuyTwoGetOne() throws Exception {
        Offer offer = new Offer();
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 100, 2);
        Milk milk = new Milk("milk", 20, 7);
        cart.addItem(apple);
        cart.addItem(milk);
        Assert.assertEquals(offer.extractOfferPriceAfterBuyTwoMilkGetOneFreeOffer(cart), 60.0);
    }

}