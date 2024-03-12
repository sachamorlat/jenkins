import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testAddDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2.5, 3.5);
        assertEquals(6.0, result, 0.0001); // Utilisation de delta pour les comparaisons de nombres à virgule flottante
    }

    @Test
    public void testSubtractIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 4);
        assertEquals(4, result);
    }

    @Test
    public void testSubtractDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(7.0, 2.5);
        assertEquals(4.5, result, 0.0001);
    }

    @Test
    public void testMultiplyIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testMultiplyDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(2.5, 3.0);
        assertEquals(7.5, result, 0.0001);
    }

    @Test
    public void testDivideIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8, 2);
        assertEquals(4, result);
    }

    @Test
    public void testDivideDoubles() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
