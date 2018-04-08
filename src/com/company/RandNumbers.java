package com.company;

//первая реализация интерфейса

import java.util.*;


public class RandNumbers implements Numbers {

    private double value;
    private String operation;


    public RandNumbers() {
        this.value = 0;
        this.operation = Operations.NOTHING.getOperation();
    }

    public RandNumbers(boolean lastValue) {
        if (lastValue == false) {
            int i = 0;
            int randAction = new Random().nextInt(4);

            for (Operations act : Operations.values()) {
                if (i == randAction) {
                    this.operation = act.getOperation();
                }
                i++;
            }
        } else {
            this.operation = Operations.NOTHING.getOperation();
        }

        this.value = new Random().nextInt(100) + 1;
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

    @Override
    public void multiply(int i, List<RandNumbers> array) {
        RandNumbers randnumber = new RandNumbers();
        randnumber.setValue(array.get(i).getValue() * array.get(i + 1).getValue());
        randnumber.setOperation(array.get(i + 1).getOperation());
        array.set(i, randnumber);
        array.remove(i + 1);
    }

    @Override
    public void divide(int i, List<RandNumbers> array) {
        RandNumbers randnumber = new RandNumbers();
        randnumber.setValue(array.get(i).getValue() / array.get(i + 1).getValue());
        randnumber.setOperation(array.get(i + 1).getOperation());
        array.set(i, randnumber);
        array.remove(i + 1);
    }

    @Override
    public void add(int i, List<RandNumbers> array) {
        RandNumbers randnumber = new RandNumbers();
        randnumber.setValue(array.get(i).getValue() + array.get(i + 1).getValue());
        randnumber.setOperation(array.get(i + 1).getOperation());
        array.set(i, randnumber);
        array.remove(i + 1);
    }

    @Override
    public void substract(int i, List<RandNumbers> array) {
        RandNumbers randnumber = new RandNumbers();
        randnumber.setValue(array.get(i).getValue() - array.get(i + 1).getValue());
        randnumber.setOperation(array.get(i + 1).getOperation());
        array.set(i, randnumber);
        array.remove(i + 1);
    }


/*  //было

    // TODO: 1.12 писать аннотацию @Override над переопределяемыми или реализуемыми методами нужно!
    @Override
    public void execute(int j, ArrayList<String> array) {

        // TODO: 1.13 опять же так сравнивать строки нельзя! (см. 1.7)
        if (array.get(j) == "*") {
            array.set(j - 1, String.valueOf(Integer.parseInt(array.get(j - 1)) * Integer.parseInt(array.get(j + 1))));
            array.remove(j);
            array.remove(j);

//            System.out.println("*" + array);
        } else if (array.get(j) == "/") {
            array.set(j - 1, String.valueOf(Integer.parseInt(array.get(j - 1)) / Integer.parseInt(array.get(j + 1))));
            array.remove(j);
            array.remove(j);

//            System.out.println("/" + array);
        } else if (array.get(j) == "+") {
            array.set(j - 1, String.valueOf(Integer.parseInt(array.get(j - 1)) + Integer.parseInt(array.get(j + 1))));
            array.remove(j);
            array.remove(j);

//            System.out.println("+" + array);
        } else {
            array.set(j - 1, String.valueOf(Integer.parseInt(array.get(j - 1)) - Integer.parseInt(array.get(j + 1))));
            array.remove(j);
            array.remove(j);

//            System.out.println("-" + array);
        }

    }*/
}