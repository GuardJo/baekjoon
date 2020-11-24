package SkillCheckTest.Level01;

import java.io.*;

public class DartGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String dartResult = br.readLine();
        int result = solution(dartResult);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String dartResult) {
        int answer = 0;
        int[] sum = new int[3];
        int sumIndex = -1;
        char[] c = dartResult.toCharArray();
        int num = 0;
        String s = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= '0' && c[i] <= '9') {
                s += c[i];
            }
            else if (c[i] == '#') {
                sum[sumIndex] *= -1;
            }
            else if (c[i] == '*') {
                sum[sumIndex] *= 2;
                if (sumIndex - 1 >= 0) {
                    sum[sumIndex - 1] *= 2;
                }
            }
            else {
                sumIndex++;
                num = Integer.parseInt(s);
                s = "";
                sum[sumIndex] = num;
                if (c[i] == 'S') {
                    continue;
                }
                else if (c[i] == 'D') {
                    sum[sumIndex] = (int) Math.pow(sum[sumIndex], 2);
                }
                else if (c[i] == 'T') {
                    sum[sumIndex] = (int) Math.pow(sum[sumIndex], 3);
                }
            }
        }

        for (int i = 0; i < sum.length; i++) {
            answer += sum[i];
        }

        return answer;
    }
}
