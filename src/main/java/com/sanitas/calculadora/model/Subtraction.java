package com.sanitas.calculadora.model;

import java.math.BigDecimal;

public class Subtraction extends BinaryOperation {
    public Subtraction(BigDecimal pOperand1, BigDecimal pOperand2) {
        this.operand1 = pOperand1;
        this.operand2 = pOperand2;
    }

    @Override
    public BigDecimal execute() {
        return operand1.subtract(operand2);
    }
}
