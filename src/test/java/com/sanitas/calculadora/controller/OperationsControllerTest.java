package com.sanitas.calculadora.controller;


import com.sanitas.calculadora.controller.request.get.Operator;
import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.model.Subtraction;
import com.sanitas.calculadora.service.OperationsService;
import com.sanitas.calculadora.service.OperationsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OperationsControllerTest {

    @Autowired
    @InjectMocks
    private static OperationsController operationsController;
    @Mock
    private final OperationsService operationsService = mock(OperationsServiceImpl.class);
    @Mock
    private final OperationsMapper operationsMapper = mock(OperationsMapper.class);

    @Test
    public void contextLoads() throws Exception {
        assertThat(operationsController).isNotNull();
    }


    /**
     * Test a add operation in controller
     */
    @Test
    public void getOperationResultWithAddition() {

        Operation operation = new Addition(new BigDecimal(5), new BigDecimal(5));
        when(operationsMapper.toDTO(new BigDecimal(5), Operator.ADD, new BigDecimal(5)))
                .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(new BigDecimal(10));

        assertThat(operationsController.getOperationResult(BigDecimal.valueOf(5), Operator.ADD, BigDecimal.valueOf(5))).isEqualTo(new BigDecimal(10));

    }

    /**
     * Test a sub operation in controller
     */
    @Test
    public void getOperationResultWithSubtraction() {
        Operation operation = new Subtraction(new BigDecimal(5), new BigDecimal(3));
        when(operationsMapper.toDTO(new BigDecimal(5), Operator.SUB, new BigDecimal(3)))
                .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(new BigDecimal(2));

        assertThat(operationsController.getOperationResult(BigDecimal.valueOf(5), Operator.SUB, BigDecimal.valueOf(3))).isEqualTo(new BigDecimal(2));

    }

}