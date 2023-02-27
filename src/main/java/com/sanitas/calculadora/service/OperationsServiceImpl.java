package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Operation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
public class OperationsServiceImpl implements OperationsService {

    @Override
    public BigDecimal execute(Operation operation) {
        return operation.execute();
    }

}