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
        System.out.println(calculator.calculate("5+5"));
        System.out.println(calculator.calculate("222 + 54"));
        System.out.println(calculator.calculate("222 / 54"));
        System.out.println(calculator.calculate("2222   - 212354"));
        System.out.println(calculator.calculate("3 * 4"));
    }

}