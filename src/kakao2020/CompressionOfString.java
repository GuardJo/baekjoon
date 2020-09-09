package kakao2020;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class CompressionOfString {
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
        String[] str = s.split("");
        int answer = Integer.MAX_VALUE;
        Queue<String> q = new LinkedList<>();
        int index = 1;
        while (index <= s.length()) {
            for (int i = 0; i < s.length(); i+=index) {
                if (i+index <= s.length()) {
                    q.offer(s.substring(i, i + index));
                }
                else {
                    q.offer(s.substring(i));
                }
            }
            int compressionSize = compression(q);
            if (answer > compressionSize) {
                answer = compressionSize;
            }
            index++;
            q.clear();
        }
        return answer;
    }

    private static int compression(Queue<String> q) {
        String compressionWords = "";
        int count = 1;
        String base = q.poll();
        while (!q.isEmpty()) {
            String next = q.poll();
            if (base.equals(next)) {
                count++;
            }
            else {
                if (count > 1) {
                    compressionWords += count;
                }
                compressionWords += base;
                base = next;
                count = 1;
            }
        }

        if (count > 1) {
            compressionWords += count;
        }
        compressionWords += base;

        return compressionWords.length();
    }
}
