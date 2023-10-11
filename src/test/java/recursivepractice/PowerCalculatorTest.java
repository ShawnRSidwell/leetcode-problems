package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @Test
    void calculatePowerTest() {
        assertEquals(0, powerCalculator.calculatePower(0,100), "0 ^ 100");
        assertEquals(3125, powerCalculator.calculatePower(5,5), "5 ^ 5");
        assertEquals(8, powerCalculator.calculatePower(2,3), "2 ^ 3");


    }
}