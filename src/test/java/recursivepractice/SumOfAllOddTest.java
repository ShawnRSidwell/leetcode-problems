package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllOddTest {

    SumOfAllOdd sumOfAllOdd = new SumOfAllOdd();

    @Test
    void testCalcSumOfAllOdd() {
        int[] oddList = new int[]{1,1,3,5};
        int[] mixedList = new int[]{1,2,3,4,5};
        int[] evenList = new int[]{2,4,6,2,4};
        int[] nothingList = new int[]{};

        assertEquals(4, sumOfAllOdd.calcSumOfAllOdd(oddList), "oddList");
        assertEquals(3, sumOfAllOdd.calcSumOfAllOdd(mixedList), "mixedList");
        assertEquals(0, sumOfAllOdd.calcSumOfAllOdd(evenList), "evenList");
        assertEquals(0, sumOfAllOdd.calcSumOfAllOdd(nothingList), "nothingList");


    }
}