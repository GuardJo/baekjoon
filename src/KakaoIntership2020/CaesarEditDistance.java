package KakaoIntership2020;

import java.io.*;
import java.util.ArrayList;

public class CaesarEditDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String source = br.readLine();
        String target = br.readLine();

        int result = solution(source, target);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String source, String target) {
        int answer = Integer.MAX_VALUE;
        char[] s = source.toCharArray();
        char[] t = target.toCharArray();
        ArrayList<Character> check = new ArrayList<>();

        for (int i = 0; i < t.length; i++) {
            check.add(t[i]);
        }

        for (int i = 0; i < 26; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                s[j]++;
                if (s[j] > 'z') {
                    s[j] = 'a';
                }
                if (!check.contains(s[j])) {
                    count++;
                }
                else {
                    if (t[j] != s[j]) {
                        count++;
                    }
                }
            }
            if (answer > count) {
                answer = count;
            }
        }

        return answer * 2;
    }
}
