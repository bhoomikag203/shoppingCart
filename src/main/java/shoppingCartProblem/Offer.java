package shoppingCartProblem;

import java.util.List;

public class Offer {
    public double fivePercentDiscount(Cart cart) {
        double discountAmount;
        if (cart.totalPrice >= 100) {
            discountAmount = cart.totalPrice * 0.05;
            return discountAmount;
        }
        return 0;
    }

    public double extractOfferPriceAfterBuyTwoMilkGetOneFreeOffer(Cart cart) {
        double discountAmount;
        int milkCount = 0;
        double milkPrice = 0;
        List<Item> items = cart.items;
        for (Item item : items) {
            if (item instanceof Milk) {
                milkCount += item.getQuantity();
                milkPrice = item.getPrice();
            }
        }
        milkCount /= 2;
        discountAmount = milkPrice * milkCount;
        return discountAmount;
    }
}