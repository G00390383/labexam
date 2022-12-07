package ie.atu.exam;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void addNamePass(){
        Employee myEmployee = new Employee("Darragh", 123455, 089123456789l, "Man", "Full-time", 21);
        assertEquals("Darragh", Employee.getName);
    }

    @AfterEach
    void tearDown() {
    }
}