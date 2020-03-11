package shoppingCartProblem;

public class Checkout {
    public double getGrandTotalPrice(Offer offer, Cart cart) {
        return cart.totalPrice= cart.totalPrice -
                offer.fivePercentDiscount(cart) +
                offer.extractOfferPriceAfterBuyTwoMilkGetOneFreeOffer(cart);
    }
}
