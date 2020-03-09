package shoppingCartProblem;

public class Customer {
    private String name;
    Cart cart;
    CreditCard creditCard;
    EWallet eWallet;

    public Customer(String name, Cart cart, CreditCard creditCard, EWallet eWallet) {
        this.name = name;
        this.cart = cart;
        this.creditCard = creditCard;
        this.eWallet = eWallet;
    }

    public void selectPaymentMode(PaymentMode paymentMode) throws Exception {
        double totalPrice = cart.computeTotalPrice();
        switch (paymentMode) {
            case E_WALLET:
                if (eWallet.balanceAmount < totalPrice) {
                    throw new Exception("Low balance! Add money to wallet");
                } else {
                    eWallet.deductAmount(totalPrice);
                }
                break;
            case CREDIT_CARD:
                if (creditCard.balanceAmount < totalPrice) {
                    throw new Exception("Low balance! Add money to wallet");
                } else
                    creditCard.deductAmount(totalPrice);
                break;
            default:
                throw new Exception("Unable to select payment mode");
        }
    }
}
