package Talentinum.SampleTest;

import java.io.*;
import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        int k = Integer.parseInt(br.readLine());

        String result = findNumber(arr, k);

        bw.write(result + "\n");
        br.close();
        bw.flush();
        bw.close();
    }

    private static String findNumber(ArrayList<Integer> arr, int k) {
        String answer = "NO";
        if (arr.contains(k)) {
            answer = "YES";
        }
        return answer;
    }
}
