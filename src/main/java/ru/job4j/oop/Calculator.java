package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = Calculator.sum(10);
        int resultMinus = Calculator.minus(10);
        int resultDivide = calculator.divide(10);
        int resultSumAll = calculator.sumAllOperation(10);
        System.out.println(resultSum);
        System.out.println(resultMinus);
        System.out.println(resultDivide);
        System.out.println(resultSumAll);
    }
}
