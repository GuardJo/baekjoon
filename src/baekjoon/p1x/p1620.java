package baekjoon.p1x;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>나는야 포켓몬 마스터 이다솜</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/1620">문제 링크</a>
 */
public class p1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        int[] inputSizeArr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int inputSize = inputSizeArr[0];
        int answerSize = inputSizeArr[1];

        for (int i = 0; i < inputSize; i++) {
            String input = br.readLine();

            map1.put(i + 1, input);
            map2.put(input, i + 1);
        }

        for (int i = 0; i < answerSize; i++) {
            String question = br.readLine();

            try {
                int index = Integer.parseInt(question);
                bw.write(map1.get(index) + "\n");
            } catch (NumberFormatException e) {
                bw.write(map2.get(question) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
