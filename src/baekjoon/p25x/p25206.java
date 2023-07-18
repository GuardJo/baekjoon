package baekjoon.p25x;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>너의 평점은</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/25206">문제 링크</a>
 */
public class p25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = new String[20];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = br.readLine();
        }

        bw.write(String.valueOf(solution(inputs)));

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String[] inputs) {
        Map<String, Float> map = initMap();
        float totalScore = 0.0f;
        float myScore = 0.0f;

        for (String input : inputs) {
            String[] str = input.split(" ");
            float baseScore = Float.parseFloat(str[1]);

            if (!str[2].equals("P")) {
                totalScore += baseScore;
                myScore += map.get(str[2]) * baseScore;
            }
        }

        return String.format("%.6f", myScore / totalScore);
    }

    private static Map<String, Float> initMap() {

        return Map.of(
                "A+", 4.5f,
                "A0", 4.0f,
                "B+", 3.5f,
                "B0", 3.0f,
                "C+", 2.5f,
                "C0", 2.0f,
                "D+", 1.5f,
                "D0", 1.0f,
                "F", 0.0f
        );
    }
}
