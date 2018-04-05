package com.company;

import java.util.ArrayList;

public class MathOperations implements Executions {

    public void execute(int j, ArrayList<String> array) {

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