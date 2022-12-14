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

    /*@Test
    void addNameFail(){
        Employee myEmployee = new Employee("Dar", 123455, 123, "Man", "Full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid name entered");
    }*/

    @Test
    void addPpsnPass(){
        Employee myEmployee = new Employee("Darragh", 123455, 123, "Man", "Full-time", 21);
        assertEquals(123455, myEmployee.getPpsn());
    }

    /*@Test
    void addPpsnFail(){
        Employee myEmployee = new Employee("Darragh", 1234552, 123, "Man", "Full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid ppsn entered");
    }*/

    @Test
    void addPhonePass(){
        Employee myEmployee = new Employee("Darragh", 123455, 12345678910L, "Man", "Full-time", 21);
        assertEquals(12345678910L, myEmployee.getPhone());
    }

    /*@Test
    void addPpsnFail(){
        Employee myEmployee = new Employee("Darragh", 1234552, 123, "Man", "Full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid ppsn entered");
    }*/

    @Test
    void addGenderPass(){
        Employee myEmployee = new Employee("Darragh", 123455, 12345678910L, "man", "Full-time", 21);
        assertEquals("man", myEmployee.getGender());
    }

    /*@Test
    void addGenderFail(){
        Employee myEmployee = new Employee("Darragh", 1234552, 12345678910L, "Nan", "full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid Gender entered");
    }*/

    @Test
    void addEmpTypePass(){
        Employee myEmployee = new Employee("Darragh", 123455, 12345678910L, "man", "full-time", 21);
        assertEquals("full-time", myEmployee.getEmpType());
    }

    /*@Test
    void addPpsnFail(){
        Employee myEmployee = new Employee("Darragh", 1234552, 123, "man", "full-time", 21);
        assertThrows(IllegalArgumentException, "Invalid ppsn entered");
    }*/

    @Test
    void addAgePass(){
        Employee myEmployee = new Employee("Darragh", 123455, 12345678910L, "man", "full-time", 21);
        assertEquals(21, myEmployee.getAge());
    }

    /*@Test
    void addAgeFail(){
        Employee myEmployee = new Employee("Darragh", 1234552, 123455, "man", "Full-time", 16);
        assertThrows(IllegalArgumentException, "Invalid ppsn entered");
    }*/
    @AfterEach
    void tearDown() {
    }
}