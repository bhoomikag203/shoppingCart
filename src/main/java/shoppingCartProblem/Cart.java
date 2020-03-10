package shoppingCartProblem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    int noOfItems;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double computeTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
             totalPrice = totalPrice + item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public int totalItemCount() {
        for (Item item : items) {
            noOfItems += item.getQuantity();
        }
        return noOfItems;
    }

}
