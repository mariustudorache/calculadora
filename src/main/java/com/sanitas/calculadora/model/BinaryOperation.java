package com.sanitas.calculadora.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public abstract class BinaryOperation implements Operation{

        BigDecimal operand1;
        BigDecimal operand2;

}
