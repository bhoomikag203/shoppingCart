package shoppingCartProblem;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PurchaseTest {
    @BeforeTest
    public Cart initializeCart() {
        Cart cart = new Cart();
        Apple apple = new Apple("apple", 10, 1);
        NewsPaper newsPaper = new NewsPaper("newspaper", (float) 10, 2);
        Milk milk = new Milk("milk", 20, 4);
        cart.addItem(apple);
        cart.addItem(newsPaper);
        cart.addItem(milk);
        return cart;
    }

    @Test
    public void shouldPurchase() throws Exception {
        Offer offer = new Offer();
        Cart cart = initializeCart();
        System.out.println("bill amount before offer = " + cart.computeTotalPrice());
//        System.out.println("5% discount = "+ offer.fivePercentDiscount(cart));
//        System.out.println("Buy 2 get 1 offer  = "+ offer.extractOfferPriceAfterBuyTwoMilkGetOneFreeOffer(cart));

        Checkout checkout = new Checkout();
        System.out.println("bill amount after offer =  " + checkout.getGrandTotalPrice(offer, cart));

        CreditCard creditCard = new CreditCard(0);
//        creditCard.addAmount(200);

        EWallet eWallet = new EWallet(0);
        eWallet.addAmount(200);
        Customer customer = new Customer("ABC", cart, creditCard, eWallet);

        System.out.println("Credit card balance before purchasing items = " + eWallet.balanceAmount);
        customer.selectPaymentMode(PaymentMode.E_WALLET);
        System.out.println("Credit card balance after purchasing items = " + eWallet.balanceAmount);
    }

    @AfterTest
    public void shouldEmptyCart() {
        Cart cart = initializeCart();
        cart.emptyCart();
        System.out.println("Cart is empty");
    }
}