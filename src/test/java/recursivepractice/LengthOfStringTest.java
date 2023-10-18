package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfStringTest {

    LengthOfString lengthOfString = new LengthOfString();

    @Test
    void calcLength() {
        String hello = "hello";
        String test = "test";
        String awesome = "awesome";
        assertEquals(5, lengthOfString.calcLength(hello));
        assertEquals(4, lengthOfString.calcLength(test));
        assertEquals(awesome.length(), lengthOfString.calcLength(awesome));

    }
}