package SkillCheckTest.Level01;

import java.io.*;
import java.util.Arrays;

public class DeleteMinimumNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {10};
        int[] result = solution(arr);

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        int min = tmp[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index] = arr[i];
                index++;
            }
        }
        if (answer.length <= 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
