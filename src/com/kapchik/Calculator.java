package com.kapchik;

import java.util.List;

public class Calculator {

    private String calculate(String expression) {

        ExpParser parser = new ExpParser(expression);
        List<Number> array = parser.parse();

        while (array.size() > 1) {

            int i = 0;

            Number getNumb = array.get(i);
            Number getNextNumb = array.get(i + 1);

            if (getNumb.getOperation().equals(Operations.MULTIPLY.getOperation())) {
                getNumb.multiply(i, array);
            } else if (getNumb.getOperation().equals(Operations.DIVIDE.getOperation())) {
                getNumb.divide(i, array);
            } else if (getNextNumb.getOperation().equals(Operations.MULTIPLY.getOperation())) {
                getNextNumb.multiply(i + 1, array);
            } else if (getNextNumb.getOperation().equals(Operations.DIVIDE.getOperation())) {
                getNextNumb.divide(i + 1, array);
            } else if (getNumb.getOperation().equals(Operations.ADD.getOperation())) {
                getNumb.add(i, array);
            } else if (getNumb.getOperation().equals(Operations.SUBSTRACT.getOperation())) {
                getNumb.substract(i, array);
            }
        }

        return expression + " = " + array.get(0).getValue();
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate(" 455 / 7 + 85 -74 + 815 / 111"));
        System.out.println(calc.calculate("44+11-75*84+555"));
        System.out.println(calc.calculate("315 / 7+14-88"));
        System.out.println(calc.calculate("41+59*10-590+59 "));
//        System.out.println(calc.calculate("315 / "));


    }
}
