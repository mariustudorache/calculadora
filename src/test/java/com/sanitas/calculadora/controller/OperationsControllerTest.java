package com.sanitas.calculadora.controller;


import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.model.Subtraction;
import com.sanitas.calculadora.service.OperationsService;
import com.sanitas.calculadora.service.OperationsServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
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


    /**
     * Test a add operation in controller
     */
    @Test
    public void getOperationResultWithAddition() {
        Operation operation = new Addition(new BigDecimal(5), new BigDecimal(3));
        when(operationsMapper.toDTO(anyString(), any(Operator.class), anyString()))
                .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(new BigDecimal(5));

    }

    /**
     * Test a sub operation in controller
     */
    @Test
    public void getOperationResultWithSubtraction() {
        Operation operation = new Subtraction(new BigDecimal(5), new BigDecimal(3));
        when(operationsMapper.toDTO(anyString() , any(Operator.class), anyString()))
                .thenReturn(operation);
        when(operationsService.execute(operation)).thenReturn(new BigDecimal(2));

    }

}