package baekjoon.p2x;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>수 정렬하기</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2750">문제 링크</a>
 */
public class p2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize = Integer.parseInt(br.readLine());
        List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < inputSize; i++) {
            inputList.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> result = solution(inputList);

        result.forEach(System.out::println);

        br.close();
        bw.flush();
        bw.close();
    }

    private static List<Integer> solution(List<Integer> inputList) {
        return inputList.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
    }
}
