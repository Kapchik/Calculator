package com.company;

public enum Operations {
    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-"),
    NOTHING("");

    final private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
 /*   // TODO: 1.8 используй ключевое слово final всегда, когда у тебя не меняется поле в классе
    // (В enum это правило работает всегда)
    // можешь почитать для чего final писать над неизменяемыми полями
    final private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
*/
}
