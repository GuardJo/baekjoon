package baekjoon.p2x;

import java.io.*;
import java.time.LocalTime;

/**
 * <h1>오븐 시계</h1>
 * <p>백준 문제 : 2525번</p>
 * <a href="https://www.acmicpc.net/problem/2525">문제 링크</a>
 */
public class p2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();
        String answer = solution(input1, input2);

        bw.write(answer);

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String input1, String input2) {
        String[] arr = input1.split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        LocalTime current = LocalTime.of(hour, minute);

        LocalTime finishTime = current.plusMinutes(Long.parseLong(input2));

        return finishTime.getHour() + " " + finishTime.getMinute();
    }
}
