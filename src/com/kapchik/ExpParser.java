package com.kapchik;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpParser {

    private String expression;
    private final Pattern pattern = Pattern.compile("\\d+\\s*[-|/|+|*]?");
//    private final Pattern patternReplace = Pattern.compile("[-|/|+|*]?");

    public ExpParser(String expression) {
        this.expression = expression + " "; //ебаный костыль, пока не смог сделать простейший replace. чтобы partOfExpression работал корректно
    }

    public List<Number> parse() {
        Matcher matcher = pattern.matcher(expression);
        List<Number> array = new ArrayList<>();

        while (matcher.find()) {
            Number number = new Number();
            String partOfExpression = expression.substring(matcher.start(), matcher.end() - 1);
//            StringBuffer sb = new StringBuffer(partOfExpression);

//            Matcher matcherReplace = patternReplace.matcher(partOfExpression);
//            if (matcherReplace.find()) {
//                matcherReplace.appendReplacement(sb, "");
//                matcherReplace.appendTail(sb);
//
//                System.out.println(sb);
//            }


            number.setValue(Double.parseDouble(partOfExpression));

            for (Operations act : Operations.values()) {

                if (expression.substring(matcher.end() - 1, matcher.end()).equals(act.getOperation())){
                    number.setOperation(act.getOperation());
                    break;
                } else {
                    number.setOperation(Operations.NOTHING.getOperation());
                }
            }
            array.add(number);
        }
//        for (Number numb : array) {
//            System.out.print(numb.getValue() + "[");
//            System.out.print(numb.getOperation() + "]");
//        }
        return array;
    }

}