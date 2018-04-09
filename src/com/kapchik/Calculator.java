package com.kapchik;

import java.util.*;

//хочу еще добавить скобки и обработать exception (del 0), добавить ввод значений руками - как вторую реализацию Numbers,
//но в третьем уже))) приближении, я считаю, готово

// TODO: 2.13 (last comment)
// В общем и целом лучше конечно, но я так и не увидел где точка входа в калькулятор
// Как мне им воспользоваться будучи разработчиком
// Все по прежнему каким-то куском выглядит общим, нет такого класса или метода (лучше класса)
// который я бы взял и начал использовать и был уверен что получу функциональность
// калькулятора хотябы в каком-то самом простом виде
public class Calculator {


    public static final int MAX_EXPRESSION_SIZE = 10;

    public static void main(String[] args) {

        // TODO: 2.1 когда работаешь с классами с generic'ом,
        // при создании объекта указывай угловые скобки '<' и '>' (далее будет diamonds)
        // пример: ты написал new ArrayList() а нужно new ArrayList<>()
        List<RandNumbers> array = new ArrayList();

        // TODO: 2.2 сколько времени ты потратил на выдумывание вот этой штуки?
        // Конечно это хорошо что ты задачу любую готов кодом решать,
        // но разве не проще на текущем этапе просто тупо написать в список примеров штук 5-10 и хватит
        // и не думать о всей этой рандомизации?
        // (random пронизывает твой код и присутствует почти везде, калькулятор не подразумевает столько рандома)
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

            // TODO: 2.3 зачем ты везде повторяешь вызов array.get(i)?
            // вынеси в отдельную переменную и работай с ней, так же гораздо меньше кода

            // TODO: 2.4 Попробуй в следующий раз действовать от общего к частному
            // сейчас конечно читаемости гораздо больше,
            // но все же вот эта передача array в методы add, multiply etc. выглядит очень нехорошо,
            // далее будут по этому поводу комментарии
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

}
