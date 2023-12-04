package baekjoon.p2x;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>대표값2</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/2587">문제 링크</a>
 */
public class p2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            inputList.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> result = solution(inputList);

        result.forEach(System.out::println);

        br.close();
        bw.flush();
        bw.close();
    }

    private static List<Integer> solution(List<Integer> inputList) {
        inputList = inputList.stream()
                .sorted()
                .collect(Collectors.toList());

        int center = inputList.get(inputList.size() / 2);
        int average = inputList.stream()
                .reduce(Integer::sum)
                .get() / inputList.size();

        return List.of(average, center);
    }
}
