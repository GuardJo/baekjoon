package baekjoon.p10x;

import java.io.*;
import java.util.Arrays;

/**
 * <h1>공 넣기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10810">문제 링크</a>
 */
public class p10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sizes = br.readLine().split(" ");
        int totalSize = Integer.parseInt(sizes[0]);
        int inputSize = Integer.parseInt(sizes[1]);
        String[] inputs = new String[inputSize];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = br.readLine();
        }

        bw.write(solution(totalSize, inputs));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int totalSize, String[] inputs) {
        String answer = "";
        int[] arr = new int[totalSize];

        for (String input : inputs) {
            String[] str = input.split(" ");
            int start = Integer.parseInt(str[0]) - 1;
            int end = Integer.parseInt(str[1]) - 1;
            int target = Integer.parseInt(str[2]);

            for (int i = start; i <= end; i++) {
                arr[i] = target;
            }
        }

        for (int n : arr) {
            answer +=  n + " ";
        }

        return answer.substring(0, answer.length() - 1);
    }
}
