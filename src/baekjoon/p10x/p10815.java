package baekjoon.p10x;

import java.io.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <h1>숫자 카드</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/10815">문제 링크</a>
 */
public class p10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize1 = Integer.parseInt(br.readLine());
        Set<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        int inputSize2 = Integer.parseInt(br.readLine());
        int[] cards = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::new)
                .toArray();

        for (int n : cards) {
            String result = (numbers.contains(n)) ? "1" : "0";
            bw.write(result + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
