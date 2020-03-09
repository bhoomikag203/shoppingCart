package shoppingCartProblem;

public class EWallet implements PaymentService {

    double balanceAmount;

    public EWallet(double balanceAmount) {
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

