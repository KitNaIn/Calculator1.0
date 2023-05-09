package Service;

import Service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testDivide() {
        double result = calculatorService.divide(10.0, 2.0);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    public void testMultiply() {
        int result = calculatorService.multiply(5, 3);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calculatorService.subtract(8, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAdd() {
        int result = calculatorService.add(2, 3);
        Assertions.assertEquals(5, result);
    }
}
