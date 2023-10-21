package main.hw_1;

public class Calculator {
    public static  double calculateDiscount(double purchaseAmount, int discountAmount){

        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Недопустимые аргументы: сумма покупки и скидка должны быть неотрицательными");
        }

        double discount = purchaseAmount * discountAmount / 100.0;
        return purchaseAmount - discount;
    }
}
