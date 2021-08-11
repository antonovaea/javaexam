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
            try {
                String lastResult = ""; //конечный результат
                int countDots = 0; //счетчик наличия точки в уравнении, если есть, значит итоговое число double
                Expression e = new Expression(input); //уравнение
                double v = e.calculate(); //считаем
                double nan = Double.NaN;
                String nanStr = String.valueOf(nan);
                String vNan = String.valueOf(v);
                ArrayList<Character> chars = new ArrayList<>(); //создаем ArrayList со всеми символами уравнения
                for (int i = 0; i < input.length(); i++){
                    chars.add(input.charAt(i));
                }
                for (int i = 0; i < chars.size(); i++){ //проверяем наличие плавающей точки
                    if (chars.get(i) == '.'){
                        countDots++;
                    }
                }
                if (countDots > 0 && !vNan.equals(nanStr)){ // && если стринговое значение v не "NaN"
                    lastResult = String.valueOf(v); //если плавающая точка есть - кладем в итог double
                } else if (countDots == 0 && !vNan.equals(nanStr)) { // && если стринговое значение v не "NaN"
                    int intResult = (int) v;
                    String newResult = String.valueOf(intResult); //иначе, кладем в итог int
                    lastResult = newResult;
                } else if (vNan.equals(nanStr)) { // && если стринговое значение v = "NaN" значит результат null
                    lastResult = null;
                }
                return  lastResult;
            } catch (NullPointerException e){
                return null;
            }

        }
}
