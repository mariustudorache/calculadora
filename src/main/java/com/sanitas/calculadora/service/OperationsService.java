package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Operation;

import java.math.BigDecimal;

public interface OperationsService {
     BigDecimal execute(Operation operation);
}
