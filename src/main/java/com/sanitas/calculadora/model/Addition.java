package com.sanitas.calculadora.model;

import java.math.BigDecimal;

public class Addition  extends  BinaryOperation{
    public Addition(BigDecimal pOperand1, BigDecimal pOperand2) {
        this.operand1 = pOperand1;
        this.operand2 = pOperand2;
    }

    @Override
    public BigDecimal execute() {
        return operand1.add(operand2);
    }
}
