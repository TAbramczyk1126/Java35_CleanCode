
import org.futureCollars.lesson5.task3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldReturnSumResultOfTwoNumbers() {
        //Given
        double a = 6;
        double b = 3;
        char operation = '+';
        double expectedResult = 9;
        //When
        double result = Calculator.mathOperation(a, b, '+');
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnSubtractResultOfTwoNumbers() {
        //Given
        double a = 6;
        double b = 3;
        char operation = '-';
        double expectedResult = 3;
        //When
        double result = Calculator.mathOperation(a, b, '-');
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnMultiplyResultOfTwoNumbers() {
        //Given
        double a = 6;
        double b = 3;
        char operation = '*';
        double expectedResult = 18;
        //When
        double result = Calculator.mathOperation(a, b, '*');
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnDivideResultOfTwoNumbers() {
        //Given
        double a = 6;
        double b = 3;
        char operation = '/';
        double expectedResult = 2;
        //When
        double result = Calculator.mathOperation(a, b, '/');
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
