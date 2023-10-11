package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfAllNumbersTest {

    SumOfAllNumbers sumOfAllNumbers = new SumOfAllNumbers();

    @Test
    void calculateSumTest() {
        assertEquals(6, sumOfAllNumbers.calculateSum(3), "3");
        assertEquals(10, sumOfAllNumbers.calculateSum(4), "4");
        assertEquals(15, sumOfAllNumbers.calculateSum(5), "5");
        assertEquals(21, sumOfAllNumbers.calculateSum(6), "6");
        assertEquals(28, sumOfAllNumbers.calculateSum(7), "7");
        assertEquals(1, sumOfAllNumbers.calculateSum(1), "1");
    }
}