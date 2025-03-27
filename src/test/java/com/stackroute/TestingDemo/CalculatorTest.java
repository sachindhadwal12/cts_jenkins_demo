package com.stackroute.TestingDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator ;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
        System.out.println("Before Each Method");
    }

    @AfterEach
    void tearDown(){
        calculator = null;
        System.out.println("After Each Method");
    }


    @Test
    @Disabled
    void myFirstTest() {
        assertTrue(true);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
//    Act
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void shouldReturnDifferenceOfTwoNumbers() {
//    Act
        int result = calculator.subtract(20, 10);
        assertEquals(10, result);

    }


    @Test
    public void shoudlReturnExceptionInputMismatchException() {
        assertThrows(NumberFormatException.class,
                () -> calculator.add(Integer.parseInt("a"), Integer.parseInt("b")));
    }


    @ParameterizedTest
    @CsvSource(value = {"10,20,30", "20,30,50"})
    void shouldRturnSumOfTwoNumbers(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
}