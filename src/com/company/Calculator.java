package com.company;

import java.util.*;

//можно еще перейти от int к дробным, добавить скобки и обработать exception (del 0), добавить ввод значений руками,
//прописать в явном виде equals, сравнивать через него
//но во втором уже))) приближении, я считаю, готово

public class Calculator {

    private static final int DEFUALT_VALUE = 25;
    private static final int MAX_VALUE = 100;
    private static final int MAX_SIZE_EXPRESSION = 10;

    public static void main(String[] args) {
        int vnVar;
        Random vnRand = new Random();
        ArrayList<String> vaArray = new ArrayList<>();

        for(int i = 0; i < MAX_SIZE_EXPRESSION; i++) {

            int j = vnRand.nextInt(MAX_VALUE) + 1;
            vaArray.add(String.valueOf(j));

            if (i != MAX_SIZE_EXPRESSION - 1) {
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

        MathOperations math = new MathOperations();

        for (int i = 0; i < Actions.values().length; i++) {
            for (int j = 1; j < vaArray.size(); j += 2) {
                if (vaArray.get(j) == Actions.values()[i].getAct()) {
                    math.execute(j, vaArray);
                }
            }
        }

        System.out.print("= " + vaArray.get(0));

    }

}
