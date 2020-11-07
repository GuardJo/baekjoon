package SkillCheckTest.Level01;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SepherateNumberToReverseSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long result = solution(n);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        String s = "";

        Arrays.sort(str, Comparator.reverseOrder());

        for (int i = 0; i < str.length; i++) {
            s += Long.parseLong(str[i]);
        }
        answer = Long.parseLong(s);

        return answer;
    }
}
