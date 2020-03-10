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
    public void shouldExtractOfferPriceForBuyTwoMilkGetOneFree() throws Exception {
        Offer offer = new Offer();
        Apple apple = new Apple("apple", 10, 2);
        Milk milk = new Milk("milk", 20, 13);
        NewsPaper newsPaper = new NewsPaper("Vijaya Karnataka", 5, 2);
        offer.cart.addItem(apple);
        offer.cart.addItem(milk);
        offer.cart.addItem(newsPaper);

        System.out.println("Bill amount before offer " + offer.cart.computeTotalPrice());
        System.out.println("Bill amount after 5% discount " + offer.fivePercentDiscount());
        System.out.println("Bill amount for buy 2 milk get 1 free " + offer.extractOfferPriceForBuyTwoMilkGetOneFree());

        Assert.assertEquals(offer.extractOfferPriceForBuyTwoMilkGetOneFree(), 155.5);
    }

}