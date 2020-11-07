package SkillCheckTest.Level01;

import java.io.*;

public class CheckSQRT {
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
        double x = Math.sqrt(n);
        double check = x - (int)x;
        if (check == 0) {
            x++;
            answer = (long) Math.pow(x, 2);
        }
        else {
            answer = -1;
        }
        return answer;
    }
}
