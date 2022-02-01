package org.example.calculator_backend.controller;

import org.example.calculator_backend.model.Operator;
import org.example.calculator_backend.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final ICalculatorService service;

    @Autowired
    public CalculatorController(ICalculatorService service) {
        this.service = service;
    }

    @PostMapping("/calculator")
    public Double calculate(@RequestBody Operator operator) {

        Double result;

        switch (operator.getType()) {
            case PLUS -> result = service.plus(operator);
            case MINUS -> result = service.minus(operator);
            case MULTIPLY -> result = service.multiply(operator);
            case DIVISION -> result = service.division(operator);
            case SQRT -> result = service.sqrt(operator);
            case POW -> result = service.power(operator);
            case MEDIAN -> result = service.median(operator);
            default -> result = null;
        }

        return result;
    }


}
