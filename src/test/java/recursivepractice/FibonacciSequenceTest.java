package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    FibonacciSequence fibonacciSequence  = new FibonacciSequence();

    @Test
    void calculateSequenceTest() {
        assertEquals(2,fibonacciSequence.calculateSequence(3), "3");
        assertEquals(3,fibonacciSequence.calculateSequence(4), "4");
        assertEquals(55,fibonacciSequence.calculateSequence(10), "10");
    }
}