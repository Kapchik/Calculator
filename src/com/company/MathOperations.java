package com.company;

import java.util.ArrayList;

public class MathOperations implements Executions {


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

    }
}