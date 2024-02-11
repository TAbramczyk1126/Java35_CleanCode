package org.futureCollars.lesson5.task3;

public class Calculator {

    public static double mathOperation(double a, double b, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = (b != 0) ? a / b : 0;
        }
        return result;
    }
}
