package org.example.calculator_backend.model;

import java.util.List;

public class Operator {

    private OperatorType type;
    private List<Double> numbers;

    public OperatorType getType() {
        return type;
    }

    public List<Double> getNumbers() {
        return numbers;
    }

}
