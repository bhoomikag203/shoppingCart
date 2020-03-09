package shoppingCartProblem;

import java.util.List;

public class Offer {
    Cart cart = new Cart();

    public double fivePercentDiscount() {
        double totalPrice = cart.computeTotalPrice();
        if (totalPrice >= 100) {
            double discountAmount = totalPrice * 0.05;
            return totalPrice - discountAmount;
        } else {
            return totalPrice;
        }
    }

    public void buyTwoMilkGetOneFree() {
        int milkCount = 0;
        List<Item> items = cart.items;
        for (Item item : items) {
            if (item instanceof Milk) {
                milkCount += item.getQuantity();
            }
        }
        int addExtraMilk = milkCount / 2;
        Milk milk = new Milk("milk", 10.0, addExtraMilk);
        cart.addItem(milk);
    }
}
