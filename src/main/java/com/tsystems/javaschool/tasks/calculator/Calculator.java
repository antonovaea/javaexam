package com.tsystems.javaschool.tasks.calculator;
import org.mariuszgromada.math.mxparser.*;
import java.util.ArrayList;

public class Calculator {

    /**
     * Evaluate statement represented as string.
     *
     * @param statement mathematical statement containing digits, '.' (dot) as decimal mark,
     *                  parentheses, operations signs '+', '-', '*', '/'<br>
     *                  Example: <code>(1 + 38) * 4.5 - 1 / 2.</code>
     * @return string value containing result of evaluation or null if statement is invalid
     */

        public String evaluate(String input) {
            String lastResult = null;
            int countDots = 0;
            Expression e = new Expression(input);
            double v = e.calculate();
            System.out.println(v);
            String result = "";
            double nan = Double.NaN;
            //если в инпут присутствует точка, то дабл, если нет, то инт
            ArrayList<Character> chars = new ArrayList<>();
            int len = input.length();
            for (int i = 0; i < len; i++){
                chars.add(input.charAt(i));
            }
            for (int i = 0; i < chars.size(); i++){
                if (chars.get(i) == '.'){
                    countDots++;
                }
            }
            if (countDots > 0){
                lastResult = String.valueOf(v);
            } else {
                int intResult = (int) v;
                String newResult = String.valueOf(intResult);
                lastResult = newResult;
            }
            return  lastResult;
            
        } 


    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
//    public static String evaluat(String input) {
//
//        int len = input.length();
//        ArrayList operands = new ArrayList();
//        ArrayList operators = new ArrayList();
//
//        for (int i = 0; i < len; i++) {
//            if ((i + 1 <= len - 1)) {
//                if (isDigit(input.charAt(i)) && isDigit(input.charAt(i + 1))) {
//                    String temp = input.charAt(i) + "" + input.charAt(i + 1);
//                    int toInt = Integer.parseInt(temp);
//                    operands.add(toInt);
//                    i = i+1;
//                } else if (isDigit(input.charAt(i))) {
//                    operands.add(input.charAt(i));
//                } else {
//                    operators.add(input.charAt(i));
//                }
//
//            }
//        }
////
////        int result = 0;
////        result = result + (int) operands.get(0);
////        for (int t = 0; t < operators.size(); t++) {
////            char operator = (char) operators.get(t);
////            if (operator == '+') {
////                result = result + (int) operands.get(t + 1);
////
////            } else if (operator == '-') {
////                result = result - (int) operands.get(t + 1);
////            }
////        }
////        String stringResult = String.valueOf(result);
////        return stringResult;
//
//
//
//    }

}
