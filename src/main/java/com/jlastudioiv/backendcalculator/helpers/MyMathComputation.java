package com.jlastudioiv.backendcalculator.helpers;

public class MyMathComputation {
    public static double compute(double numOne, double numTwo, String operand) {
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
}
