package com.company;

import java.util.ArrayList;

public class MathOperations {

    public static void multiply(ArrayList<String> paArray) {
        for(int i = 1; i < paArray.size(); i += 2) {
            if (paArray.get(i).equals("*")) {
                paArray.set(i - 1, String.valueOf(Integer.parseInt(paArray.get(i - 1)) * Integer.parseInt(paArray.get(i + 1))));
                paArray.remove(i);
                paArray.remove(i);
                i -= 2;

//                System.out.println("*" + paArray);
            }
        }
    }

    public static void divide(ArrayList<String> paArray) {
        for(int i = 1; i < paArray.size(); i += 2) {
            if (paArray.get(i).equals("/")) {
                paArray.set(i - 1, String.valueOf(Integer.parseInt(paArray.get(i - 1)) / Integer.parseInt(paArray.get(i + 1))));
                paArray.remove(i);
                paArray.remove(i);
                i -= 2;

//                System.out.println("/" + paArray);
            }
        }
    }

    public static void addandsubstract(ArrayList<String> paArray) {
        int i = 1;
        while (i < paArray.size()) {
            if (paArray.get(i).equals("+")) {
                paArray.set(i - 1, String.valueOf(Integer.parseInt(paArray.get(i - 1)) + Integer.parseInt(paArray.get(i + 1))));
                paArray.remove(i);
                paArray.remove(i);

//                System.out.println("+" + paArray);
            } else {
                paArray.set(i - 1, String.valueOf(Integer.parseInt(paArray.get(i - 1)) - Integer.parseInt(paArray.get(i + 1))));
                paArray.remove(i);
                paArray.remove(i);

//                System.out.println("-" + paArray);

            }
        }
    }

}
