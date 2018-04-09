package com.kapchik;

//первая реализация интерфейса

import java.util.List;
import java.util.Random;

// TODO: 2.9 опять же множественное число (см. 2.6)
public class RandNumbers implements Numbers {

    private double value;
    private String operation;


    public RandNumbers() {
        this.value = 0;
        this.operation = Operations.NOTHING.getOperation();
    }

    public RandNumbers(boolean lastValue) {
        // TODO: 2.10 проверка boolean не требует подобного сравнения, ведь это и так boolean
        // я имею ввиду if (lastValue == false) и if (!lastValue) одно и то же, только второе читается лучше
        if (lastValue == false) {
            int i = 0;

            // TODO: 2.11 постарайся избавится пока вообще от слова random,
            // оно очень сильно усложняет твою программу, ты акцентируешь внимание не на том, что нужно
            // P.S. каждый раз создавать новый объект random неочень хорошо в твоей ситуации
            // будет интересно посмотри в сторону ThreadLocalRandom.current()
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
        // TODO: 2.12 так работать с входным параметром списка просто нельзя
        // (касается всех @Override методов класса)
        // 1) Сюда тебе может придти любая реализация интерфейса List,
        //    есть реализации, в которых вызов методов set(), add(), remove() etc. кидает UnsupportedOperationException
        // 2) Даже если определить тип списка как скажем ArrayList, все равно будет плохо.
        //    пользователь твоего класса никогда не узнает и не догадается что его список
        //    будет измененен внутри твоего класса пока не зайдет и не почитает код.
        //    По сути ты меняешь входные данные без видимых на то причин - плохой подход.
        //    При таком подходе очень сложно отлаживать и сопровождать код, возникает куча всяких side-эффектов,
        //    от которых мозги просто взрываются у всех, кроме автора. Да и у автора тоже спустя уже пару недель
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

}