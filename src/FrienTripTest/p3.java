package FrienTripTest;

import java.io.*;

public class p3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int result = solution(s);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static int solution(String s) {
        int answer = 0;

        for (int i = 1; i < s.length(); i++) {
            int count = isPalindrome(s, i);

            if (answer < count) {
                answer = count;
            }
        }
        return answer;
    }

    private static int isPalindrome(String s, int index) {
        int count = 0;
        int left = index - 1;
        int right = index + 1;
        String[] str = s.split("");
        String tmp = str[index];
        while (isPal(tmp)) {
            if (left >= 0) {
                tmp = left + tmp;
            }
            if (right < str.length) {
                tmp += right;
            }
        }

        return count;
    }

    private static boolean isPal(String str) {
        String[] s = str.split("");
        if (s.length % 2 == 0) {
            int mid = s.length / 2;
            for (int i = 0; i < mid; i++) {
                if (s[i].equals(s[s.length - i - 1])) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        else {
            int mid = s.length / 2;
            for (int i = 0; i < mid; i++) {
                if (s[i].equals(s[s.length - i - 1])) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
