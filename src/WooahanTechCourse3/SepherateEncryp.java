package WooahanTechCourse3;

import java.io.*;

public class SepherateEncryp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String op = br.readLine();
        long[] result = solution(s, op);

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long[] solution(String s, String op) {
        long[] answer = new long[s.length()-1];
        String[] str = s.split("");

        for (int i = 0; i < answer.length; i++) {
            String operand1 = "";
            String operand2 = "";
            for (int j = 0; j <= i; j++) {
                operand1 += str[j];
            }
            for (int j = i+1; j < str.length; j++) {
                operand2 += str[j];
            }
            long num1 = Long.parseLong(operand1);
            long num2 = Long.parseLong(operand2);
            if (op.equals("+")) {
                answer[i] = num1 + num2;
            }
            else if (op.equals("-")) {
                answer[i] = num1 - num2;
            }
            else if(op.equals("*")) {
                answer[i] = num1 * num2;
            }
            else {
                answer[i] = num1 / num2;
            }
        }

        return answer;
    }
}
