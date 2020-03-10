package shoppingCartProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EWalletTest {
    @Test
    public void shouldAddAmountToEWallet(){
        EWallet eWallet = new EWallet(200);

        eWallet.addAmount(100);

        Assert.assertEquals(eWallet.balanceAmount, 300.0);
    }

    @Test
    public void shouldDeductAmountFromEWallet(){
        EWallet eWallet = new EWallet(200);

        eWallet.deductAmount(50);

        Assert.assertEquals(eWallet.balanceAmount, 150.0);
    }
}
