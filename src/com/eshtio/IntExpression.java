package com.eshtio;

public class IntExpression {

    private final int left;
    private final CommonOperation operation;
    private final int right;

    public IntExpression(int left,
                         CommonOperation operation,
                         int right) {
        this.left = left;
        this.operation = operation;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public CommonOperation getOperation() {
        return operation;
    }

    public int getRight() {
        return right;
    }

}