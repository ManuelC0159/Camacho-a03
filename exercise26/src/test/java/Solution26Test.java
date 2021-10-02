import baseline.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution26Test {



    @Test
    public void test1(){
        PaymentCalculator calc = new PaymentCalculator(5000, 12, 100 );
        assertEquals(70, calc.calculateMonthsUntilPaidOff());
    }
    @Test
    public void test2(){
        PaymentCalculator calc = new PaymentCalculator(1350, 12, 500 );
        assertEquals(3, calc.calculateMonthsUntilPaidOff());
    }
    @Test
    public void test3(){
        PaymentCalculator calc = new PaymentCalculator(700, 13, 10 );
        assertEquals(131, calc.calculateMonthsUntilPaidOff());
    }
}
