package baekjoon.p10x;

import java.io.*;

/**
 * <h1>개수 세기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10807">문제 링크</a>
 */
public class p10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int target = Integer.parseInt(br.readLine());

        String answer = solution(size, input.split(" "), target);

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int size, String[] arr, int target) {
        int count = 0;

        for (String s : arr) {
            int item = Integer.parseInt(s);

            if (item == target) {
                count++;
            }
        }

        return String.valueOf(count);
    }
}
