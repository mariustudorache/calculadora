package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.controller.request.get.Operator;
import com.sanitas.calculadora.model.Operation;
import com.sanitas.calculadora.service.OperationsService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
@Validated
public class OperationsController {

    private OperationsMapper operationsMapper;
    private OperationsService operationsService;


    @GetMapping("/operations")
    @ResponseBody
    public BigDecimal getOperationResult( @RequestParam(required = true) BigDecimal operand1,
                                         @RequestParam(required = true)  Operator operator,
                                          @RequestParam(required = true)  BigDecimal operand2){
        Operation operation = operationsMapper.toDTO(operand1, operator, operand2);
        return this.operationsService.execute(operation);
    }
}
