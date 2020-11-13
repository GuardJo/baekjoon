package SkillCheckTest.Level01;

import java.io.*;

/**
 * 콜라츠의 추측
 */
public class GuessOfCollatz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int result = solution(num);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int num) {
        int answer = 0;
        long num2 = num;
        while (num2 > 1) {
            if (num2 % 2 == 0) {
                num2 /= 2;
            }
            else {
                num2 = (num2 * 3) + 1;
            }
            answer++;
            if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
