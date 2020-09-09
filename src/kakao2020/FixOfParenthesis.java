package kakao2020;

import java.io.*;
import java.util.Stack;

public class FixOfParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String p = br.readLine();

        String result = solution(p);
        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String p) {
        String answer = "";
        if (isAllRight(p)) {
            answer = p;
        }
        else if (p.length() == 0) {
            // blank
        }
        else {
            answer = sepharateUV(p, answer);
        }

        return answer;
    }

    private static String sepharateUV(String p, String answer) {
        String[] str = p.split("");
        String[] result = new String[2];
        int left = 0;
        int right = 0;
        int index = 0;
        if (str[index].equals("(")) {
            left++;
        }
        else {
            right++;
        }
        while (left != right && index < p.length()) {
            index++;
            String s = str[index];
            if (s.equals("(")) {
                left++;
            }
            else {
                right++;
            }
        }

        result[0] = p.substring(0, index+1);
        if (index < p.length()-1) {
            result[1] = sepharateUV(p.substring(index+1), answer);
        }
        else {
            result[1] = "";
        }

        if (isAllRight(result[0])) {
            answer += result[0] + result[1];
        }
        else {
            answer += "(" + result[1] + ")";
            String tmp = "";
            String[] str2 = result[0].split("");
            for (int i = 1; i < str2.length-1; i++) {
                if (str2[i].equals("(")) {
                    tmp += ")";
                }
                else {
                    tmp += "(";
                }
            }
            answer += tmp;
        }
        return answer;
    }

    private static boolean isAllRight(String p) {
        char[] c = p.toCharArray();
        boolean result = true;
        Stack<Character> left = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                left.push(c[i]);
            }
            else {
                if (left.isEmpty()) {
                    return false;
                }
                else {
                    left.pop();
                }
            }
        }

        if (!left.isEmpty()) {
            result = false;
        }
        return result;
    }
}
