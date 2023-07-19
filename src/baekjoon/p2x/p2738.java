package baekjoon.p2x;

import java.io.*;

/**
 * <h1>행렬 덧셈</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2738">문제 링크</a>
 */
public class p2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sizes = br.readLine().split(" ");
        int size1 = Integer.parseInt(sizes[0]);
        int size2 = Integer.parseInt(sizes[1]);
        int[][] arr1 = new int[size1][size2];
        int[][] arr2 = new int[size1][size2];

        for (int i = 0; i < arr1.length; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < rows.length; j++) {
                arr1[i][j] = Integer.parseInt(rows[j]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < rows.length; j++) {
                arr2[i][j] = Integer.parseInt(rows[j]);
            }
        }

        int[][] answer = solution(arr1, arr2);

        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < answer[0].length; j++) {
                sb.append(answer[i][j] + " ");
            }

            bw.write(sb.substring(0, sb.length() - 1));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[][] solution(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
