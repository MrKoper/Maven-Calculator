package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void TestSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5,7));
    }

    @Test
    public void TestSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(7,2));
    }

    @Test
    public void TestMultiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5), 0.001);
    }

    @Test
    public void TestDivide() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.divide(36,3), 0.001);
    }

    @Test
    public void TestDivide() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.divide(36,3), 0.001);
    }


    @Test
    public void TestAvg() {
        Calculator calc = new Calculator();
        assertEquals(50,calc.avg(2,3,5));
    }
}
