package com.company;

public enum Actions {
    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-");

    // TODO: 1.8 используй ключевое слово final всегда, когда у тебя не меняется поле в классе
    // (В enum это правило работает всегда)
    // можешь почитать для чего final писать над неизменяемыми полями
    private String act;

    Actions(String act) {
        this.act = act;
    }

    public String getAct() {
        return act;
    }

}
