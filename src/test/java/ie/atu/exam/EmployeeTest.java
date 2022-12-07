package ie.atu.exam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Object IllegalArgumentException;

    @BeforeEach
    void setUp() {
    }

    @Test
    void addNamePass(){
        Employee myEmployee = new Employee("Darragh", 123455, 123, "Man", "Full-time", 21);
        assertEquals("Darragh", myEmployee.getName());
    }

    @Test
    void addNameFail(){
        Employee myEmployee = new Employee("Darragh", 123455, 123, "Man", "Full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid name entered");


    }

    @AfterEach
    void tearDown() {
    }
}