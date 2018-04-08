package com.eshtio;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser {

    private static final String LEFT_GROUP = "left";
    private static final String RIGHT_GROUP = "right";
    private static final String OPERATION_GROUP = "operation";

    /**
     * Regex выражение для разбора примеров с целыми числами
     */
    private static final Pattern INT_EXPRESSION_PARSE_PATTERN = Pattern.compile(
            "(?<" + LEFT_GROUP + ">\\d*)\\s*(?<" + OPERATION_GROUP + ">["
                    + operationsRegex() + "])\\s*(?<" + RIGHT_GROUP + ">\\d*)");

    public IntExpression parseToIntExpression(String stringExpression) {
        Matcher matcher = INT_EXPRESSION_PARSE_PATTERN.matcher(stringExpression);
        if (matcher.find()) {
            return new IntExpression(
                    Integer.parseInt(matcher.group(LEFT_GROUP)),
                    CommonOperation.bySymbol(matcher.group(OPERATION_GROUP)),
                    Integer.parseInt(matcher.group(RIGHT_GROUP)));

        }
        throw new IllegalStateException("String expression can't be parsed: " + stringExpression);
    }

    private static String operationsRegex() {
        StringJoiner joiner = new StringJoiner("|");
        for (CommonOperation operation : CommonOperation.values()) {
            joiner.add(operation.getSymbol());
        }
        return joiner.toString();
    }

}