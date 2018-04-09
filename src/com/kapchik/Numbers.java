package com.kapchik;

import java.util.List;

// TODO: 2.6 почему множественное число?
// ведь на сколько я понял число то одно
public interface Numbers {

    // TODO: 2.7 неиспользуемые переменные
    // скорее всего просто не заметил сейчас,
    // но на будущее - практически всегда неиспользуемый код это мусор
    double value = 0;
    String operation = null;

    // TODO: 2.8 вот скажи зачем тебе передавать какой-то левый список туда?
    // он же не имеет никакого отношения к операции, есть число (int i) - да хорошо, но список точно лишний
    // вместо этого ты можешь сделать возвращаемое значение в методе, будет гораздо читабельней
    // будет видно что делает метод, что конкретно ему нужно, и какой результат
    void multiply(int i, List<RandNumbers> array);

    void divide(int i, List<RandNumbers> array);

    void add(int i, List<RandNumbers> array);

    void substract(int i, List<RandNumbers> array);

}
