package baekjoon.p9x;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <h1>대지</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/9063">문제 링크</a>
 */
public class p9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            xList.add(Integer.parseInt(input[0]));
            yList.add(Integer.parseInt(input[1]));
        }

        bw.write(String.valueOf(solution(xList, yList)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(List<Integer> xList, List<Integer> yList) {
        Collections.sort(xList);
        Collections.sort(yList);

        return (xList.get(xList.size() - 1) - xList.get(0)) *
                (yList.get(yList.size() - 1) - yList.get(0));
    }
}
