package main.hw_1;

import org.assertj.core.api.Assertions;

public class Calculator {
    public static  double calculateDiscount(double purchaseAmount, int discountAmount){

//        Assertions.assertThat(purchaseAmount).isGreaterThanOrEqualTo(0)
//                .withFailMessage("Недопустимая сумма покупки: должна быть неотрицательной");
//        Assertions.assertThat(discountAmount).isGreaterThanOrEqualTo(0)
//                .withFailMessage("Недопустимая сумма скидки: должна быть неотрицательной");
//
//        double discount = purchaseAmount * discountAmount / 100.0;
//        return purchaseAmount - discount;

        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Недопустимые аргументы: сумма покупки и скидка должны быть неотрицательными");
        }

        double discount = purchaseAmount * discountAmount / 100.0;
        return purchaseAmount - discount;
    }


    public static void start_1 (){
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        double expectedDiscountedAmount = 80.0;
        double actualDiscountedAmount = calculateDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }
}
