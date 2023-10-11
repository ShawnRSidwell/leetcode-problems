package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    GreatestCommonDivisor gcd = new GreatestCommonDivisor();

    @Test
    void calculateCommonDivisor() {
        assertEquals(2, gcd.calculateCommonDivisor(16,18));
    }
}