package KakaoIntership2020;

import java.io.*;

public class DiverseDeputations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        int result = solution(m, w);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int m, int w) {
        int answer = 0;

        if (m < 1 || w < 1) {
            return 0;
        }
        int mCount = count(m, 1);
        int wCount = count(w, 2);
        answer += mCount * wCount;
        mCount = count(m, 2);
        wCount = count(w, 1);
        answer += mCount * wCount;

        return answer;
    }

    private static int count(int gender, int cnt) {
        int answer = 0;
        if (cnt == 1) {
            return gender;
        }
        else {
            for (int i = 0; i < gender; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
