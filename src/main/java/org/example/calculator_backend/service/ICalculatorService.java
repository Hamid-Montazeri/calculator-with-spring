package org.example.calculator_backend.service;

import org.example.calculator_backend.model.Operator;

public interface ICalculatorService {

    Double plus(Operator operator);

    Double minus(Operator operator);

    Double multiply(Operator operator);

    Double division(Operator operator);

    Double power(Operator operator);

    Double sqrt(Operator operator);

    Double median(Operator operator);




}
