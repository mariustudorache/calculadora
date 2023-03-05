package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class OperationsServiceImplTest {

    private static OperationsService operationsService;

    @BeforeAll
    public static void setup() {
        operationsService = new OperationsServiceImpl();
    }

    /**
     * Addition service test
     */
    @Test
    public void operationsServiceExecuteAdditionTest() {
        Assertions.assertEquals(operationsService.execute(new Addition(new BigDecimal(1), new BigDecimal(2))), new BigDecimal(3));
    }

    /**
     * Subtraction service test
     */
    @Test
    public void operationsServiceExecuteSubtractionTest() {
        Assertions.assertEquals(operationsService.execute(new Subtraction(new BigDecimal(1), new BigDecimal(2))), new BigDecimal(-1));
    }
}