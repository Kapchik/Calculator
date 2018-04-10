package com.kapchik;

import java.util.List;

public class Number {

    private double value;
    private String operation;

    public Number() {
        this.value = 0;
        this.operation = Operations.NOTHING.getOperation();
    }

    public double getValue() {
        return value;
    }

    public String getOperation() {
        return operation;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void multiply(int i, List<Number> array) {
        Number number = new Number();
        number.setValue(array.get(i).getValue() * array.get(i + 1).getValue());
        number.setOperation(array.get(i + 1).getOperation());
        array.set(i, number);
        array.remove(i + 1);
    }

    public void divide(int i, List<Number> array) {
        Number number = new Number();
        number.setValue(array.get(i).getValue() / array.get(i + 1).getValue());
        number.setOperation(array.get(i + 1).getOperation());
        array.set(i, number);
        array.remove(i + 1);
    }

    public void add(int i, List<Number> array) {
        Number number = new Number();
        number.setValue(array.get(i).getValue() + array.get(i + 1).getValue());
        number.setOperation(array.get(i + 1).getOperation());
        array.set(i, number);
        array.remove(i + 1);
    }

    public void substract(int i, List<Number> array) {
        Number number = new Number();
        number.setValue(array.get(i).getValue() - array.get(i + 1).getValue());
        number.setOperation(array.get(i + 1).getOperation());
        array.set(i, number);
        array.remove(i + 1);
    }

}