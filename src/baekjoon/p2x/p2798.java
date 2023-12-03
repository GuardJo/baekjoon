package baekjoon.p2x;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>블랙잭</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2798">문제 링크</a>
 */
public class p2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        List<Integer> input2 = new ArrayList<>(Arrays.asList(br.readLine().split(" "))).stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int nSize = Integer.parseInt(input1[0]);
        int maxNumber = Integer.parseInt(input1[1]);

        int result = calc(input2, maxNumber);

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int calc(List<Integer> list, int maxNumber) {
        int max = 0;

        for (int i = 0; i < list.size() - 2; i++) {
            int first = list.get(i);
            for (int j = i + 1; j < list.size() - 1; j++) {
                int second = list.get(j);
                for (int k = j + 1; k < list.size(); k++) {
                    int third = list.get(k);

                    int sum = first + second + third;

                    if (sum > max && sum <= maxNumber) {
                        max = sum;
                    }
                }
            }
        }

        return max;
    }
}
