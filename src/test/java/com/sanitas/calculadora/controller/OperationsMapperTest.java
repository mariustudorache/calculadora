package com.sanitas.calculadora.controller;

import static org.junit.jupiter.api.Assertions.*;


import com.sanitas.calculadora.controller.request.get.Operator;
import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.model.Subtraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Mapper test
 */
public class OperationsMapperTest {

    private static OperationsMapper operationsMapper;

    @BeforeAll
    public static void setUp() {
        operationsMapper = new OperationsMapper();
    }

    /**
     * Test a add operation to dto mapping
     */
    @Test
    public void additionOperationDTOTest() {
        BigDecimal operand2 = new BigDecimal(2);
        BigDecimal operand1 = new BigDecimal(1);
        Operation operation = operationsMapper.toDTO(operand1, Operator.ADD, operand2);
        Assertions.assertTrue(operation instanceof Addition);
        Assertions.assertEquals(((Addition) operation).getOperand1(), operand1);
        Assertions.assertEquals(((Addition) operation).getOperand2(), operand2);
    }

    /**
     * Test a sub operation to dto mapping
     */
    @Test
    public void subtractionOperationDTOTest() {
        BigDecimal operand2 = new BigDecimal(2);
        BigDecimal operand1 = new BigDecimal(1);
        Operation operation = operationsMapper.toDTO(operand1, Operator.SUB, operand2);
        Assertions.assertTrue(operation instanceof Subtraction);
        Assertions.assertEquals(((Subtraction) operation).getOperand1(), operand1);
        Assertions.assertEquals(((Subtraction) operation).getOperand2(), operand2);
    }
}