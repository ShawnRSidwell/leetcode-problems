package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeProblemTest {

    PalindromeProblem palindromeProblem = new PalindromeProblem();

    @Test
    void isPalindromeHappyPath() {
        assertTrue(palindromeProblem.isPalindrome("abba"));
        assertTrue(palindromeProblem.isPalindrome("racecar"));
    }

    @Test
    void isPalindromeTest() {
        assertFalse(palindromeProblem.isPalindrome("asdfasd"));
        assertFalse(palindromeProblem.isPalindrome("asdfasgasdga"));
    }
}