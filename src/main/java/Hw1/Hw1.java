package Hw1;

import Hw1.Calculator.Calculator;
import static org.assertj.core.api.Assertions.*;

public class Hw1 {
    public static void main(String[] args) {

        double test1 = Calculator.calculatingDiscount(1000,15);
        assertThat(test1).isEqualTo(850);

        double test2 = Calculator.calculatingDiscount(0,15);
        assertThat(test2).isEqualTo(0);

        double test3 = Calculator.calculatingDiscount(1000,0);
        assertThat(test3).isEqualTo(1000);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000, -15))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid argument");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(1000, 115))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid argument");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-1000, 15))
                .isInstanceOf(ArithmeticException.class).hasMessage("Invalid argument");
    }


}

