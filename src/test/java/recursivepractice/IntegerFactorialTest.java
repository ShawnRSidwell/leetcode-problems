package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntegerFactorialTest {


    @Test
    public void calculateFactorialTest() {
        assertEquals(120, IntegerFactorial.calculateFactorial(5), "5!");
        assertEquals(24, IntegerFactorial.calculateFactorial(4), "4!");
        assertEquals(6, IntegerFactorial.calculateFactorial(3), "3!");
    }
}