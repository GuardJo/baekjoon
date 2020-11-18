package KNUProgrammingTest;

import java.io.*;

/**
 * 중복된 문자열 치환
 */
public class p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String src = br.readLine();
        String result = solution(src);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String src) {
        String answer = "";
        String[] str = src.split("");

        int count = 1;
        String s = str[0];
        for (int i = 0; i < str.length; i++) {
            if (i == 0) {
                answer += str[i];
            }
            else if (s.equals(str[i])) {
                count++;
            }
            else {
                answer += (char)('A' + (count - 1));
                count = 1;
            }
            s = str[i];
        }
        answer += (char)('A' + (count - 1));

        return answer;
    }
}
