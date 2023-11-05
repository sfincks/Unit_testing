package Hw1.Calculator;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount >100 || purchaseAmount < 0) {
            throw new ArithmeticException("Invalid argument");
        }
        if (discountAmount == 0){
            return purchaseAmount;
        }
        return purchaseAmount - ((purchaseAmount * discountAmount / 100));
        /** при условии, что discountAmount это число % скидки
         * например: 1000 - (1000*23/100) */
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        // Метод должен возвращать сумму покупки со скидкой
    }



}