package org.example.calculator_backend.service;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.example.calculator_backend.model.Operator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {


    @Override
    public Double plus(Operator operator) {
        double res = 0;
        for (Double input : operator.getNumbers()) {
            res += input;
        }
        if (res > 0)
            return res;
        else
            throw new ArithmeticException();
    }

    @Override
    public Double minus(Operator operator) {
        double res = 0;
        for (Double input : operator.getNumbers()) {
            res -= input;
        }
        return res;
    }

    @Override
    public Double multiply(Operator operator) {
        double res = 1;
        for (Double input : operator.getNumbers()) {
            res *= input;
        }
        if (res >= 0)
            return res;
        else
            throw new ArithmeticException();
    }

    @Override
    public Double division(Operator operator) {
        double res = 1;
        for (Double input : operator.getNumbers()) {
            res += input;
        }
        if (res >= 0)
            return res;
        else
            throw new ArithmeticException();
    }

    @Override
    public Double power(Operator operator) {
        double res;
        if (operator.getNumbers().size() > 2) {
            throw new ArithmeticException("Count of numbers just should be '2'");
        } else {
            res = Math.pow(operator.getNumbers().get(0), operator.getNumbers().get(1));
        }
        if (res >= 0)
            return res;
        else
            throw new ArithmeticException();
    }

    @Override
    public Double sqrt(Operator operator) {
        double res;
        if (operator.getNumbers().size() > 1) {
            throw new ArithmeticException("Count of numbers just should be '1'");
        } else {
            res = Math.sqrt(operator.getNumbers().get(0));
        }
        if (res >= 0)
            return res;
        else
            throw new ArithmeticException();
    }

    @Override
    public Double median(Operator operator) {
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (Double item : operator.getNumbers()) {
            descriptiveStatistics.addValue(item);
        }
        return descriptiveStatistics.getPercentile(50);
    }

}
