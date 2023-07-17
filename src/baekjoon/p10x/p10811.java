package baekjoon.p10x;

import java.io.*;

/**
 * <h1>바구니 뒤집기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10811">문제 링크</a>
 */
public class p10811 {
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

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (String input : inputs) {
            String[] str = input.split(" ");
            int start = Integer.parseInt(str[0]) - 1;
            int end = Integer.parseInt(str[1]) - 1;

            for (int i = start; i <= end; i++) {
                int tmp = arr[end];
                arr[end--] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int n : arr) {
            answer += n + " ";
        }

        return answer.substring(0, answer.length() - 1);
    }
}
