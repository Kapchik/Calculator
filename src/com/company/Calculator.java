package com.company;

import java.util.*;

//хочу еще добавить скобки и обработать exception (del 0), добавить ввод значений руками - как вторую реализацию Numbers,
//но в третьем уже))) приближении, я считаю, готово

public class Calculator {


    public static final int MAX_EXPRESSION_SIZE = 10;

    public static void main(String[] args) {

        List<RandNumbers> array = new ArrayList();

        for (int i = 0; i <= MAX_EXPRESSION_SIZE; i++) {
            if (i == MAX_EXPRESSION_SIZE) {
                array.add(new RandNumbers(true));
            } else {
                array.add(new RandNumbers(false));
            }
        }

        for (RandNumbers rn : array) {
            System.out.print(rn.getValue() + " ");
            System.out.print(rn.getOperation() + " ");
        }

        while (array.size() > 1) {
            int i = 0;

            if (array.get(i).getOperation().equals(Operations.MULTIPLY.getOperation())) {
                array.get(i).multiply(i, array);
            } else if (array.get(i).getOperation().equals(Operations.DIVIDE.getOperation())) {
                array.get(i).divide(i, array);
            } else if (array.get(i + 1).getOperation().equals(Operations.MULTIPLY.getOperation())) {
                array.get(i + 1).multiply(i + 1, array);
            } else if (array.get(i + 1).getOperation().equals(Operations.DIVIDE.getOperation())) {
                array.get(i + 1).divide(i + 1, array);
            } else if (array.get(i).getOperation().equals(Operations.ADD.getOperation())) {
                array.get(i).add(i, array);
            } else if (array.get(i).getOperation().equals(Operations.SUBSTRACT.getOperation())) {
                array.get(i).substract(i, array);
            }
        }

        System.out.println("= " + array.get(0).getValue());

    }

 /* //было

    private static final int DEFUALT_VALUE = 25;
    private static final int MAX_VALUE = 100;
    private static final int MAX_SIZE_EXPRESSION = 10;

    public static void main(String[] args) {
        int vnVar;
        Random vnRand = new Random();

        // TODO: 1.0 правильнее будет использовать интерфейс в типе переменной
        // List<String> vaArray = new ArrayList<>(); - качественное объявление списка

        ArrayList<String> vaArray = new ArrayList<>();

        // TODO: 1.1 весь этот цикл кажется каким-то чрезмерным усложнением, я так понял ты тут типа хотел
        // нагенерить пример для калькулятора, но выглядит очень непонятно,
        // готов поспорить что через пол года взглянешь и для понимание потребуется усилие.
        // Плюс ко всему не вижу ни метода ни класса в который я бы скормил сруктуру данных
        // или пример в строчку и он бы не выдал результат
        // (есть класс калькулятор но он ничего не делает по факту, main метод и все),
        // т.е. код по сути ни переиспользовать ни расширить никак - это важно в проектах,
        // на будущее - старайся структурировать свой код

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

        // TODO: 1.3 не ленись обрамлять в скобки '{' '}' цикл for, if и т.д. даже если одна строчка кода.
        // Читаемости намного больше
        for (int i = 0; i < vaArray.size(); i++) System.out.print(vaArray.get(i) + " ");

        // TODO: 1.4 опять же в типе переменной стоит использовать интерфейс (см 1.0)
        RandNumbers math = new RandNumbers();

        // TODO: 1.5 вот эти циклы ниже просто жесть конкретная
        // 1) Если ты закладываешься на порядок элементов в enum,
        //    стоит это как-то явно показать, потому что никому не мешает зайти в этот enum и отсортировать
        //    нафиг твои значения по алфавиту скажем и все сломается
        // 2) Сама идея закидывать все в список (и числа и операции) она проигрышна почему -
        //    потому что приходится вот выдумывать какие-то сложные итерации через два элемента и т.д.
        //    Такой код очень сложно поддерживать, читать, расширять. Да с ним вообще очень сложно работать.
        //    Есть ситуации когда без сложного кода не обойтись, но это точно не тот случай.

        // TODO: 1.6 почитай как работают люди с enum'ми, в интернете много примеров, будет гораздо понятнее
        // И код твой станет читабельнее везде, где есть enum. Enum - очень крутая вещь
        for (int i = 0; i < Operations.values().length; i++) {
            for (int j = 1; j < vaArray.size(); j += 2) {
                // TODO: 1.7 (ВАЖНО) так сравнивать почти всегда нельзя!
                // Посмотри как сравнивать строки или любые другие объекты в java.
                if (vaArray.get(j) == Operations.values()[i].getOperation()) {
                    math.execute(j, vaArray);
                }
            }
        }

        System.out.print("= " + vaArray.get(0));

    }
*/
}
