package com.company;

public enum Actions {
    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-");

    private String act;

    Actions(String act) {
        this.act = act;
    }

    public String getAct() {
        return act;
    }

}
