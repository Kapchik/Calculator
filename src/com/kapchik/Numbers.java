package com.kapchik;

import java.util.List;

public interface Numbers {

    double value = 0;
    String operation = null;

    void multiply(int i, List<RandNumbers> array);

    void divide(int i, List<RandNumbers> array);

    void add(int i, List<RandNumbers> array);

    void substract(int i, List<RandNumbers> array);

    /*  // было

    // TODO: 1.9 опять же невежливо принимать тип по классу в метод если нужен тебе лишь интерфейс
    // Тут легко зайдет List

    // TODO: 1.10 прочти как у тебя называется интерфейс. Это похоже на интерфейс?
    // совсем непонятно для чего он такой нужен и что он делает, принимает какое-то i и какой-то array.

    // TODO: 1.11 опять же общая концепция хромает, этот список неизвестно чего пронизывает все приложение
    // как с этим работать?

     void execute(int i, ArrayList<String> array);
*/

}
