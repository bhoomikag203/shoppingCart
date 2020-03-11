package shoppingCartProblem;

public class CreditCard implements PaymentService {
    double balanceAmount;

    public CreditCard(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    @Override
    public double addAmount(double amount) {
        balanceAmount += amount;
        return balanceAmount;
    }

    @Override
    public double deductAmount(double amount) {
        balanceAmount -= amount;
        return balanceAmount;
    }
}
