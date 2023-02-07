package Assignmnet4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepairFaultExistingSystemTest {

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(50.0, RepairFaultExistingSystem.celsiusToFahrenheit(10), 0.01);
        assertEquals(68.0, RepairFaultExistingSystem.celsiusToFahrenheit(20), 0.01);
        assertEquals(86.0, RepairFaultExistingSystem.celsiusToFahrenheit(30), 0.01);
        assertEquals(32.0, RepairFaultExistingSystem.celsiusToFahrenheit(0), 0.01);
    }

}