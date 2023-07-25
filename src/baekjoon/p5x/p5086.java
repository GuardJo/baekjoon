package baekjoon.p5x;

import java.io.*;

/**
 * <h1>배수와 약수</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/5086>문제 링크</a>
 */
public class p5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (true) {
            input = br.readLine();
            String[] arr = input.split(" ");

            if (arr[0].equals("0") && arr[1].equals("0")) {
                break;
            }

            bw.write(solution(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int left, int right) {
        if (right % left == 0) {
            return "factor";
        } else if (left % right == 0) {
            return "multiple";
        } else {
            return "neither";
        }
    }
}
