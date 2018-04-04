package com.company;

import java.util.*;

//можно еще перейти от int к дробным, добавить скобки и обработать exception (del 0), добавить ввод значений руками
//но в первом приближении, я считаю, готово

public class Calculator {

    public static final int DEFUALT_VALUE = 25;

    public static void main(String[] args) {
        int vnVar;
        Random vnRand = new Random();
        ArrayList<String> vaArray = new ArrayList<String>();

        for(int i = 0; i < 10; i++) {

            int j = vnRand.nextInt(98) + 1;
            vaArray.add(String.valueOf(j));

            if (i != 9) {
                vnVar = j / DEFUALT_VALUE;

                switch (vnVar) {
                    case 0: vaArray.add("*");
                            break;
                    case 1: vaArray.add("/");
                            break;
                    case 2: vaArray.add("-");
                            break;
                    case 3: vaArray.add("+");
                            break;
                }
            }
        }

        for(int i = 0; i < vaArray.size(); i++) System.out.print(vaArray.get(i) + " ");

        MathOperations.multiply(vaArray);

        MathOperations.divide(vaArray);

        MathOperations.addandsubstract(vaArray);

        System.out.print("= " + vaArray.get(0));

    }

}
