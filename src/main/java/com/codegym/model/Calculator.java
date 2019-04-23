package com.codegym.model;

public class Calculator {
    private double firstNumber;
    private double secondeNumber;
    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Calculator() {
    }

    public Calculator(double firstNumber, double secondeNumber) {
        this.firstNumber = firstNumber;
        this.secondeNumber = secondeNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondeNumber() {
        return secondeNumber;
    }

    public void setSecondeNumber(double secondeNumber) {
        this.secondeNumber = secondeNumber;
    }
}
