package shoppingCartProblem;

import java.util.List;

public class Offer {

    double totalPrice;

    public double fivePercentDiscount(Cart cart) {
//        totalPrice = cart.totalPrice;
//        if (totalPrice >= 100) {
//            double discountAmount = totalPrice * 0.05;
//            totalPrice -= discountAmount;
//            return totalPrice;
//        }
//        return totalPrice;
//        System.out.println("/discount amount = "+ discountAmount);

        totalPrice = cart.totalPrice;

        double discountAmount;
        if (totalPrice >= 100) {
            discountAmount = totalPrice * 0.05;
            return discountAmount;
        }
        return 0;
    }

    public double extractOfferPriceForBuyTwoMilkGetOneFree(Cart cart) {
        // // totalPrice = fivePercentDiscount(cart);
//        totalPrice = cart.totalPrice;
//        int milkCount = 0;
//        double milkPrice = 0;
//        List<Item> items = cart.items;
//        for (Item item : items) {
//            if (item instanceof Milk) {
//                milkCount += item.getQuantity();
//                milkPrice = item.getPrice();
//            }
//        }
//        milkCount /= 2;
//        totalPrice -= milkPrice * milkCount;
//        return totalPrice;

        totalPrice = cart.totalPrice;
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
        if(milkCount == 0){
            return 0;
        }else{
            milkCount /= 2;
            discountAmount = milkPrice * milkCount;
        }
        return discountAmount;
    }
}