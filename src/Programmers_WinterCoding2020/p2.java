package Programmers_WinterCoding2020;

import java.io.*;
import java.util.LinkedList;


public class p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String encrypted_text = br.readLine();
        String key = br.readLine();
        int rotation = Integer.parseInt(br.readLine());
        String result = solution(encrypted_text, key, rotation);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String encrypted_text, String key, int rotation) {
        String answer = "";
        char[] enc = encrypted_text.toCharArray();
        char[] keys = key.toCharArray();
        LinkedList<Character> q = new LinkedList<>();
        for (int i = 0; i < enc.length; i++) {
            q.add(enc[i]);
        }

        if (rotation >= 0) {
            for (int i = 0; i < rotation; i++) {
                char tmp = q.get(0);
                q.addLast(tmp);
                q.removeFirst();
            }
        }
        else {
            rotation = Math.abs(rotation);
            for (int i = 0; i < rotation; i++) {
                char tmp = q.get(enc.length-1);
                q.addFirst(tmp);
                q.removeLast();
            }
        }
        for (int i = 0; i < enc.length; i++) {
            enc[i] = q.get(i);
        }

        for (int i = 0; i < enc.length; i++) {
            int sum = enc[i] - keys[i];

            if (sum <= 0) {
                sum = 'z' + sum;
            }
            else {
                sum += 96;
            }
            answer += (char) sum;
        }
        return answer;
    }
}
