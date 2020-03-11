package shoppingCartProblem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items = new ArrayList<>();
    double totalPrice;

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double computeTotalPrice() {
        for (Item item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    public int totalItemCount() {
        int noOfItems = 0;
        for (Item item : items) {
            noOfItems += item.getQuantity();
        }
        return noOfItems;
    }

    public void emptyCart(){
        items.removeIf(item -> item instanceof Item);
    }

}
