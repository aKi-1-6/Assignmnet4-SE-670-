package Assignmnet4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheBuildTest {

    @Test
    public void testSubtraction() {
        BreakingTheBuild build = new BreakingTheBuild();
        assertEquals(2, build.subtraction(4, 2));
    }

    @Test
    public void testSubtractionFailingCases(){
        BreakingTheBuild build = new BreakingTheBuild();
        assertNotEquals(3,build.subtraction(4,2));
    }

}