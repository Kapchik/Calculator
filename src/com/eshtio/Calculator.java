package com.eshtio;

public class Calculator {

    private final ExpressionParser parser;

    public Calculator() {
        this.parser = new ExpressionParser();
    }

    public double calculate(String stringExpression) {
        IntExpression expression = parser.parseToIntExpression(stringExpression);
        return calcIntExpression(expression);
    }

    private double calcIntExpression(IntExpression expression) {
        switch (expression.getOperation()) {
            case ADD:
                return expression.getLeft() + expression.getRight();
            case DIVIDE:
                return expression.getLeft() * 1.0 / expression.getRight();
            case MULTIPLY:
                return expression.getLeft() * expression.getRight();
            case SUBSTRACT:
                return expression.getLeft() - expression.getRight();
            default:
                throw new UnsupportedOperationException(expression.getOperation().name());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        check(calculator.calculate("5+5"), 10);
        check(calculator.calculate("3 * 4"), 12);
        check(calculator.calculate("12 / 4"), 3);
        check(calculator.calculate("12 - 4"), 8);
        check(calculator.calculate("12 - 40"), -28);

        System.out.println("All simple tests completed");
    }

    private static void check(double result, double expected) {
        if (result != expected) {
            throw new RuntimeException("Result " + result + ", but expected " + expected);
        }
    }

}