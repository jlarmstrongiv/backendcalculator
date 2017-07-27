package com.jlastudioiv.backendcalculator.helpers;

public class MyMath {
    private double numOne;
    private double numTwo;
    private String operand;
    private double result;

    public double add() {
        result = numOne + numTwo;
        return result;
    }

    public double subtract() {
        result = numOne - numTwo;
        return result;
    }

    public double multiply() {
        result = numOne * numTwo;
        return result;
    }

    public double divide() {
        result = numOne / numTwo;
        return result;
    }

    public MyMath(double numOne, double numTwo, String operand) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operand = operand;
    }

    public double getNumOne() {
        return numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public String getOperand() {
        return operand;
    }

    public double getResult() {
        return result;
    }
}
