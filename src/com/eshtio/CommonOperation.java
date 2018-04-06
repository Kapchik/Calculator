package com.eshtio;

public enum CommonOperation {

    MULTIPLY("*"),
    DIVIDE("/"),
    ADD("+"),
    SUBSTRACT("-");

    private final String symbol;

    CommonOperation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static CommonOperation bySymbol(String symbol) {
        for (CommonOperation operation : CommonOperation.values()) {
            if (operation.symbol.equals(symbol)) {
                return operation;
            }
        }
        throw new IllegalArgumentException(symbol);
    }

}