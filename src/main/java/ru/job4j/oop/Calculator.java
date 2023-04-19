package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(10);
        int resultMinus = Calculator.minus(10);
        int resultDivide = new Calculator().divide(10);
        int resultSumAll = new Calculator().sumAllOperation(10);
        System.out.println(resultSum);
        System.out.println(resultMinus);
        System.out.println(resultDivide);
        System.out.println(resultSumAll);
    }
}
