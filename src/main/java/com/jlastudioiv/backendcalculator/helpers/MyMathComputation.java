package com.jlastudioiv.backendcalculator.helpers;

public class MyMathComputation {
    private double numOne;
    private double numTwo;
    private String operand;
    public double compute(double numOne, double numTwo, String operand) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.operand = operand;

        MyMath myMath = new MyMath(numOne, numTwo, operand);
        switch (operand) {
            case "+":
                return myMath.add();
            case "-":
                return myMath.subtract();
            case "*":
                return myMath.multiply();
            case "/":
                return myMath.divide();
            default:
                return 0;
        }
    }
    public String printEquation() {
        return numOne + " " + operand + " " + numTwo;
    }
}
