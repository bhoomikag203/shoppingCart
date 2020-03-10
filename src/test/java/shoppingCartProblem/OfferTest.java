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

        double discountAmount = offer.fivePercentDiscount(cart);

        Assert.assertEquals(discountAmount, 11.0);
    }

    @Test
    public void shouldExtractOfferPriceForBuyTwoMilkGetOneFree() throws Exception {
        Offer offer = new Offer();
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 100, 2);
        Milk milk = new Milk("milk", 20, 1);
        NewsPaper newsPaper = new NewsPaper("Vijaya Karnataka", 5, 2);
        cart.addItem(apple);
        cart.addItem(milk);
        cart.addItem(newsPaper);


        System.out.println("Bill amount before offer " + cart.computeTotalPrice());
        System.out.println("5% discount of bill " + offer.fivePercentDiscount(cart));
        System.out.println("Bill amount for buy 2 milk get 1 free " + offer.extractOfferPriceForBuyTwoMilkGetOneFree(cart));

        Assert.assertEquals(offer.extractOfferPriceForBuyTwoMilkGetOneFree(cart), 0.0);
    }

}