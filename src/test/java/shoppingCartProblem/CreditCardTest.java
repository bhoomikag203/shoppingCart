package shoppingCartProblem;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditCardTest {
    @Test
    public void shouldAddAmountToCreditCard(){
        CreditCard creditCard = new CreditCard(500);

        creditCard.addAmount(100);

        Assert.assertEquals(creditCard.balanceAmount, 600.0);
    }

    @Test
    public void shouldDeductAmountFromCreditCard(){
        CreditCard creditCard = new CreditCard(300);

        creditCard.deductAmount(40);

        Assert.assertEquals(creditCard.balanceAmount, 260.0);
    }
}
