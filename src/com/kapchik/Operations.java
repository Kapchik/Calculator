package com.kapchik;

public enum Operations {
    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-"),
    NOTHING("");

    // TODO: 2.5 у java разработчиков принято писать первым делом идентификатор доступа
    // а потом все остальное, т.е. сначала private потом final
    final private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

}