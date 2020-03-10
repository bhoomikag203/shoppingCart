package shoppingCartProblem;

import java.util.List;

public class Offer {
    Cart cart = new Cart();

    public double fivePercentDiscount() {
        double totalPrice = cart.computeTotalPrice();
        if (totalPrice >= 100) {
            double discountAmount = totalPrice * 0.05;
            totalPrice -= discountAmount;
            return totalPrice;
        } else {
            return totalPrice;
        }
    }

    public double extractOfferPriceForBuyTwoMilkGetOneFree() {
        double totalPrice = fivePercentDiscount();
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
        totalPrice -= milkPrice * milkCount;
        return totalPrice;
    }
}