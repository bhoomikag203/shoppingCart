package shoppingCartProblem;

public class CreditCard implements PaymentService {
    double balanceAmount;

    public CreditCard(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public void addAmount(double amount) {
        balanceAmount += amount;
    }

    @Override
    public void deductAmount(double amount) {
        balanceAmount -= amount;
    }
}
