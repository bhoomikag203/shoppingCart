package shoppingCartProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParchaseTest {
    @Test
    public void shouldSelectPaymentMode() throws Exception {
        Offer offer = new Offer();
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 10, 10);
        NewsPaper newsPaper = new NewsPaper("newspaper", (float) 10, 3);
        Milk milk = new Milk("milk", 20, 1);

        cart.addItem(apple);
        cart.addItem(newsPaper);
        cart.addItem(milk);

        double totalPriceBeforeOffer = cart.computeTotalPrice();
        System.out.println("bill amount before offer = " + totalPriceBeforeOffer);

        Checkout checkout = new Checkout();
        System.out.println("bill amount after offer =  "+ checkout.getGrandTotalPrice(offer, cart));



        CreditCard creditCard = new CreditCard(100);
        EWallet eWallet = new EWallet(200);
        Customer customer = new Customer("ABC", cart, creditCard, eWallet);

        System.out.println("Credit card balance before puchasing items = " + eWallet.balanceAmount);
        customer.selectPaymentMode(PaymentMode.E_WALLET);
        System.out.println("Credit card balance after puchasing items = " + eWallet.balanceAmount);

    }

}