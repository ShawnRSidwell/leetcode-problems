package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringProblemTest {

    ReverseStringProblem reverseStringProblem = new ReverseStringProblem();

    @Test
    void reverseStringTest() {
        assertEquals("fo",reverseStringProblem.reverseString("of"), "of" );
        assertEquals("gorf",reverseStringProblem.reverseString("frog"), "frog" );
    }
}