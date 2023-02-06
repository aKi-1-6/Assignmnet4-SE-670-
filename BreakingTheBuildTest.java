package Assignmnet4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheBuildTest {

    @Test
    public void testCalculateDifference() {
        BreakingTheBuild build = new BreakingTheBuild();
        assertEquals(2, build.calculateDifference(4, 2));
    }

    @Test
    public void testFailingCases(){
        BreakingTheBuild build = new BreakingTheBuild();
        assertNotEquals(3,build.calculateDifference(4,2));
    }

}