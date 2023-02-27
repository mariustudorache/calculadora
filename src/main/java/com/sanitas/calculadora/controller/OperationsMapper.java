package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.controller.request.get.Operator;
import com.sanitas.calculadora.model.Addition;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.model.Subtraction;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class OperationsMapper {

    public Operation toDTO(BigDecimal operand1, Operator operator, BigDecimal operand2) {
        return operator.equals(operator.ADD) ? new Addition(operand1, operand2)
                : operator.equals(operator.SUB) ? new Subtraction(operand1, operand2) : null;
    }
}