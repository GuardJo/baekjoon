package WooahanTechCourse3;

import java.io.*;

public class MartinGaleBatting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int money = 1200;
        String[] expected = {"T", "T", "H", "H", "H"};
        String[] actual = {"H", "H", "T", "H", "T"};
        int result = solution(money, expected, actual);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(int money, String[] expected, String[] actual) {
        int answer = money;
        boolean wasWin = true;
        int bat = 100;
        for (int i = 0; i < expected.length; i++) {
            if (wasWin) {
                bat = 100;
            }
            else {
                bat *= 2;
                if (bat > answer) {
                    bat = answer;
                }
            }
            if (expected[i].equals(actual[i])) {
                wasWin = true;
                answer += bat;
            }
            else {
                wasWin = false;
                answer -= bat;
            }

            if (answer <= 0) {
                return 0;
            }
        }

        return answer;
    }
}
