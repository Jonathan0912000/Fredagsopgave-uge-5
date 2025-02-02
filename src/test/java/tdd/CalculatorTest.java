package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add(){
        int a = 5;
        int b = 5;
        int expected = 10;
        int actual = calculator.add(a,b);
        assertEquals(expected,actual);
    }

    @Test
    void subtract(){
        int a = 10;
        int b = 5;
        int expected = 5;
        int actual = calculator.subtract(a,b);
        assertEquals(expected,actual);
    }

    @Test
    void multiply(){
        int a = 5;
        int b = 5;
        int expected = 25;
        int actual = calculator.multiply(a,b);
        assertEquals(expected,actual);
    }

    @Test
    void divide(){
        int a = 5;
        int b = 5;
        int expected = 1;
        int actual = calculator.divide(a,b);
        assertEquals(expected,actual);
    }
}