package com.SpringBootApplication.SpringApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.SpringBootApplication.SpringApplication.Controller.*;
@SpringBootTest
class ApplicationTests {

	@Autowired
    private CalculatorApplication calculatorController;
	
	@Test
    void testAdd() {
        double result = calculatorController.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testMultiply() {
        double result = calculatorController.multiply(5, 10);
        assertEquals(50, result);
    }

    @Test
    void testDivide() {
        double result = calculatorController.divide(20, 5);
        assertEquals(4, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorController.divide(10, 0);
        });



}
}
