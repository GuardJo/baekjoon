package Talentinum.SampleTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class p2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        List<Integer> result = oddNumbers(l, r);

        for (int i = 0; i < result.size(); i++) {
            bw.write(result.get(i) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static List<Integer> oddNumbers(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}
