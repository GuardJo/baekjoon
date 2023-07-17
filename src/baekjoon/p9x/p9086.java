package baekjoon.p9x;

import java.io.*;

/**
 * <h1>문자열</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/9086">문제 링크</a>
 */
public class p9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] inputs = new String[size];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = br.readLine();
        }

        for (String s : solution(inputs)) {
            bw.write(s);
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static String[] solution(String[] inputs) {
        String[] answer = new String[inputs.length];

        for (int i = 0; i < answer.length; i++) {
            String[] str = inputs[i].split("");
            answer[i] = str[0] + str[str.length - 1];
        }

        return answer;
    }
}
