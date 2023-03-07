package com.sanitas.calculadora.controller;


import com.sanitas.calculadora.controller.request.get.Operator;
import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.service.OperationsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class OperationsControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private OperationsService operationsService ;
    @MockBean
    private OperationsMapper operationsMapper;



    /**
     * Test a add operation in controller
     */
    @Test
    public void getOperationResultWithAddition() throws Exception {

        Operation operation = new Addition(new BigDecimal(5), new BigDecimal(5));
        when(operationsMapper.toDTO(new BigDecimal(5), Operator.ADD, new BigDecimal(3)))
                .thenReturn(operation);

        when(operationsService.execute(operation)).thenReturn(new BigDecimal(10));

        this.mockMvc.perform(get("/api/v1/operations")
                .param("operand1", BigDecimal.valueOf(5).toString())
                .param("operator", "ADD")
                .param("operand2", BigDecimal.valueOf(5).toString())

        ).andDo(print()).andExpect(status().isOk())

         ;


    }

    /**
     * Test a sub operation in controller
     */
    @Test
    public void getOperationResultWithSubtraction()  throws Exception {
        Operation operation = new Addition(new BigDecimal(5), new BigDecimal(5));
        when(operationsMapper.toDTO(new BigDecimal(5), Operator.SUB, new BigDecimal(3)))
                .thenReturn(operation);

        when(operationsService.execute(operation)).thenReturn(new BigDecimal(10));

        this.mockMvc.perform(get("/api/v1/operations")
                        .param("operand1", BigDecimal.valueOf(5).toString())
                        .param("operator", "ADD")
                        .param("operand2", BigDecimal.valueOf(5).toString())

                ).andDo(print()).andExpect(status().isOk())

           ;

    }


    /**
     * Test 404 exception
     */
    @Test
    public void itShouldThrownBadRequest() throws Exception {

        this.mockMvc.perform(get("/api/v1/operations")
                .param("operand1", BigDecimal.valueOf(5).toString())
                .param("operand2", BigDecimal.valueOf(5).toString())

        )
                .andDo(print()).andExpect(status().isBadRequest());
    }



}