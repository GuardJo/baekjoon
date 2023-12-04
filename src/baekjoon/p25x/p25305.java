package baekjoon.p25x;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>커트라인</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/25305">문제 링크</a>
 */
public class p25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input1 = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> input2 = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = solution(input1.get(1), input2);

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int limit, List<Integer> inputList) {
        inputList = inputList.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());

        return inputList.get(limit - 1);
    }
}
