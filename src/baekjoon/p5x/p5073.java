package baekjoon.p5x;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1>삼각형과 세 변</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/5073">문제 링크</a>
 */
public class p5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if (input.equals("0 0 0")) {
                break;
            }

            bw.write(solution(input));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String input) {
        String[] str = input.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);

        if (!isTriangle(x, y, z)) {
            return "Invalid";
        }

        if (x == y && y == z) {
            return "Equilateral";
        } else if (x == y || y == z || z == x) {
            return "Isosceles";
        }

        return "Scalene";
    }

    /*
    삼각형의 변 중 가장 긴 변은 나머지 변들의 합보다 작아야 함
     */
    private static boolean isTriangle(int x, int y, int z) {
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(z);

        Collections.sort(list);

        return ((list.get(0) + list.get(1)) > list.get(2));
    }
}
