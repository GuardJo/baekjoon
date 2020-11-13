package SkillCheckTest.Level01;

import java.io.*;

/**
 * 최대공약수와 최소 공배수 구하기
 */
public class GCDAndLCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] result = solution(n, m);

        for (int i = 0; i < result.length; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (n > m) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        int gcd = getLcm(n, m);
        int lcm = (n * m) / gcd;


        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    private static int getLcm(int n, int m) {
        if (m % n == 0) {
            return n;
        }
        else {
            return getLcm(m % n, n);
        }
    }
}
