package KNUProgrammingTest;

import java.io.*;

/**
 * 고전 물리학, 운동법칙 반환
 * F = m * a
 */
public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int result = solution(m, a);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int m, int a) {
        int answer = -1;

        answer = m * a;

        return answer;
    }
}
