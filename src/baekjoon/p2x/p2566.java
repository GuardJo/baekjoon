package baekjoon.p2x;

import java.io.*;

/**
 * <h1>최댓값</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2566">문제 링크</a>
 */
public class p2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            String[] lines = br.readLine().split(" ");
            for (int j = 0; j < lines.length; j++) {
                arr[i][j] = Integer.parseInt(lines[j]);
            }
        }

        int[] indexes = solution(arr);

        bw.write(arr[indexes[0]][indexes[1]] + "\n");
        bw.write((indexes[0] + 1) + " " + (indexes[1] + 1));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] solution(int[][] arr) {
        int indexX = 0;
        int indexY = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int num = arr[i][j];

                if (num > maxNum) {
                    indexX = i;
                    indexY = j;
                    maxNum = num;
                }
            }
        }

        return new int[]{indexX, indexY};
    }
}
