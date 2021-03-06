package Calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 5.0, calculator.squareRoot(25.0), DELTA);
        assertEquals("Finding square root for True Positive", 1.0, calculator.squareRoot(1.0), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 7, calculator.squareRoot(91.0), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.squareRoot(5.0), DELTA);

    }
    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.factorial(0), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.factorial(1), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 1, calculator.naturalLog(2.718), 0.2f);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.8), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(8.1), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding power for True Positive", 4, calculator.power(4, 1), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(1, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(3, 1), DELTA);
    }
}

