package SkillCheckTest.Level02_3;

import java.util.ArrayList;

public class HackertonPrice {
    public static void main(String[] args) {
        String expression = "100-200*300-500+20";
        long result = solution(expression);

        System.out.println(result);
    }

    private static long solution(String expression) {
        long answer = 0;
        String[] exp = expression.split("");
        ArrayList<ArrayList<String>> operands = new ArrayList<>();
        ArrayList<String> operand = new ArrayList<>();
        String base = "";
        for(int i = 0; i < exp.length; i++) {
            if (exp[i].equals("+") || exp[i].equals("-") || exp[i].equals("*")) {
                operand.add(exp[i]);
            }
        }
        for (int i = 0; i < operand.size(); i++) {
            expression.replaceAll(operand.get(i), " ");
        }
        exp = expression.split(" ");
        base += exp[0] + " " + operand.get(0) + " ";
        for (int i = 1; i < exp.length; i++) {
            base += exp[i] + " " + operand.get(i) + " ";
        }

        findMax(operand, expression, operands);
        return answer;
    }

    private static void findMax(ArrayList<String> operand, String expression, ArrayList<ArrayList<String>> operands) {

    }
}
