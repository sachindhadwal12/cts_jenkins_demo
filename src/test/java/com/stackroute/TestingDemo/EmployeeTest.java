package com.stackroute.TestingDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    Employee employee;

    @BeforeEach
    public void setUp() {
        employee = new Employee("Admin", "Password@123", 25);
    }

    @Test
    public void givenEmployeeNameShouldReturnEmployeeName(){
        employee.setEmpName("Arsh");
        assertEquals("Arsh", employee.getEmpName());
    }

    @Test
    public void givenPasswordShouldNotBeNull(){
        assertNotNull(employee.getPassword());
    }

    @Test
    public void givenNegativeAgeShouldThrowException(){
     employee.setAge(-4);
     Exception exception = assertThrows(NegativeAgeException.class, () -> {
         employee.checkAge();
     });
     assertEquals("Age is not valid",exception.getMessage());
    }

}