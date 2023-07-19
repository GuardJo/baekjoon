package baekjoon.p2x;

import java.io.*;

/**
 * <h1>색종이</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2563">문제 링크</a>
 */
public class p2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[][] inputs = new int[size][2];

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            inputs[i][0] = Integer.parseInt(input[0]);
            inputs[i][1] = Integer.parseInt(input[1]);
        }

        bw.write(String.valueOf(solution(inputs)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int[][] inputs) {
        boolean[][] metrix = new boolean[100][100];
        int count = 0;

        for (int[] indexes : inputs) {
            int x = indexes[0];
            int y= indexes[1];

            for (int i = x - 1; i < (x + 9); i++) {
                for (int j = y - 1; j < (y + 9); j++) {
                    metrix[i][j] = true;
                }
            }
        }

        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[0].length; j++) {
                if (metrix[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
