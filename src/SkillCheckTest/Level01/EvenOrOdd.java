package SkillCheckTest.Level01;

import java.io.*;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String result = solution(num);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(int num) {
        String answer;
        if (num % 2 == 0) {
            answer = "Even";
        }
        else {
            answer = "Odd";
        }

        return answer;
    }
}
