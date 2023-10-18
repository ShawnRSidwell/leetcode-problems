package recursivepractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PossibleStringPermutationsTest {

    PossibleStringPermutations pp = new PossibleStringPermutations();

    @Test
    void calcPermutations() {
        String hel = "hel";
        String hello = "hello";
        String h = "h";
        assertEquals(6, pp.calcPermutations(hel));
        assertEquals(120, pp.calcPermutations(hello));
        assertEquals(1, pp.calcPermutations(h));

    }
}