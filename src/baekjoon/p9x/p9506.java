package baekjoon.p9x;

import java.io.*;

/**
 * <h1>약수들의 합</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/9506">문제 링크</a>
 */
public class p9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";

        while (true) {
            input = br.readLine();

            if (input.equals("-1")) {
                break;
            }

            bw.write(solution(Integer.parseInt(input)));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number).append(" = ");
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sb.append(i).append(" + ");
                sum += i;
            }
        }

        if (sum == number) {
            return sb.substring(0, sb.length() - 3);
        }

        return number + " is NOT perfect.";
    }
}
