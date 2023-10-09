import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {

    ValidParenthesis vp = new ValidParenthesis();

    @Test
    public void isValidTest() {
        assertTrue(vp.isValid("()"));
        assertTrue(vp.isValid("{}"));
        assertTrue(vp.isValid("[]"));
        assertTrue(vp.isValid("[][]"));
        assertTrue(vp.isValid("[]{}()"));
        assertTrue(vp.isValid("{}[]()(){}[]"));
        assertTrue(vp.isValid("{}[]()(){}{}"));
    }

    @Test
    public void isNotValidTest() {
        assertFalse(vp.isValid("({)}"));
        assertFalse(vp.isValid(")("));
        assertFalse(vp.isValid("(}))))"));
        assertFalse(vp.isValid("(})"));
        assertFalse(vp.isValid("}"));
        assertFalse(vp.isValid("[}"));
        assertFalse(vp.isValid(")("));
        assertFalse(vp.isValid("([)]"));





    }
}