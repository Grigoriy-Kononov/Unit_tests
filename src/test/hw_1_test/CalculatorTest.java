package test.hw_1_test;

import main.hw_1.Calculator;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;
        double expectedDiscountedAmount = 80.0;

        double actualDiscountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountWithNegativePurchaseAmount() {
        double purchaseAmount = -100.0;
        int discountAmount = 20;

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы: сумма покупки и скидка должны быть неотрицательными");
    }

    @Test
    public void testCalculateDiscountWithNegativeDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = -20;

        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Недопустимые аргументы: сумма покупки и скидка должны быть неотрицательными");
    }
}
