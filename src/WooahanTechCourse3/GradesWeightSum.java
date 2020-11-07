package WooahanTechCourse3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GradesWeightSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] grades = {"A+", "D+", "F", "C0"};
        int[] weights = {2, 5, 10, 3};
        int threshold = 50;

        int result = solution(grades, weights, threshold);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String[] grades, int[] weights, int threshold) {
        String[] gradeStr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        int[] gradeWeight = {10, 9, 8, 7, 6, 5, 4, 3, 0};
        Map<String, Integer> map = new HashMap<>();
        int answer = -threshold;

        for (int i = 0; i < gradeStr.length; i++) {
            map.put(gradeStr[i], gradeWeight[i]);
        }

        for (int i = 0; i < grades.length; i++) {
            answer += (map.get(grades[i]) * weights[i]);
        }

        return answer;
    }
}
