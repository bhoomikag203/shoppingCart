package shoppingCartProblem;

public class Customer {
    private String name;
    Cart cart;
    CreditCard creditCard;
    EWallet eWallet;
    Offer offer = new Offer();
    Checkout checkout = new Checkout();

    public Customer(String name, Cart cart, CreditCard creditCard, EWallet eWallet) {
        this.name = name;
        this.cart = cart;
        this.creditCard = creditCard;
        this.eWallet = eWallet;
    }

    public void selectPaymentMode(PaymentMode paymentMode) throws Exception {
        switch (paymentMode) {
            case E_WALLET:
                if (eWallet.balanceAmount < cart.totalPrice) {
                    throw new Exception("Low balance! Add money to wallet");
                } else {
                    eWallet.deductAmount(cart.totalPrice);
                }
                break;
            case CREDIT_CARD:
                if (creditCard.balanceAmount < cart.totalPrice) {
                    throw new Exception("Low balance! Add money to wallet");
                } else
                    creditCard.deductAmount(cart.totalPrice);
                break;
            default:
                throw new Exception("Unable to select payment mode");
        }
    }
}
