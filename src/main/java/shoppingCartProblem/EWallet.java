package shoppingCartProblem;

public class EWallet implements PaymentService {

    double balanceAmount;

    public EWallet(double balanceAmount) {
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

