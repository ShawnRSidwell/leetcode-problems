package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementCounterTest {

    ArrayElementCounter arrayElementCounter = new ArrayElementCounter();

    @Test
    void countOccurrences() {
        Integer[] nums = new Integer[]{1,1,3,1};
        assertEquals(3, arrayElementCounter.countOccurrences(nums, 1), "1 in 1,1,3,1");
    }
}