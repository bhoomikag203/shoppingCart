package shoppingCartProblem;

public class Checkout {
    public double getGrandTotalPrice(Offer offer, Cart cart) {
        double grandTotalPrice = cart.totalPrice -
                offer.fivePercentDiscount(cart) +
                offer.extractOfferPriceForBuyTwoMilkGetOneFree(cart);
        return grandTotalPrice;
    }
}
