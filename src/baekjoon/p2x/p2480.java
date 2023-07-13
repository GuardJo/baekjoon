package baekjoon.p2x;

import java.io.*;

/**
 * <h1>주사위 3개</h1>
 * <p>백준 문제 : 2480번</p>
 * <a href="https://www.acmicpc.net/problem/2480">문제 링크</a>
 */
public class p2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String answer = solution(input);

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {
        int answer = 0;
        int[] cube = new int[6];
        int max = Integer.MIN_VALUE;
        String[] arr = input.split(" ");

        for (String s : arr) {
            int num = Integer.parseInt(s);
            cube[num-1]++;
        }

        for (int i = cube.length - 1; i >= 0; i--) {
            int num = i + 1;
            switch (cube[i]) {
                case 3:
                    answer = 10000 + (num * 1000);
                    break;
                case 2:
                    answer = 1000 + (num * 100);
                    break;
                case 1:
                    if (num > max) {
                        max = num;
                    }
                    break;
            }
        }

        answer = answer != 0 ? answer : max * 100;

        return String.valueOf(answer);
    }
}
