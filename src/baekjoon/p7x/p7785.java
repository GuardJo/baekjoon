package baekjoon.p7x;

import java.io.*;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <h1>회사에 있는 사람</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/7785">문제 링크</a>
 */
public class p7785 {
    private final static String ENTER = "enter";
    private final static String LEAVE = "leave";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputSize = Integer.parseInt(br.readLine());
        Set<String> log = new LinkedHashSet<>();

        for (int i = 0; i < inputSize; i++) {
            String[] inputArr = br.readLine().split(" ");

            if (inputArr[1].equals(ENTER)) {
                log.add(inputArr[0]);
            }

            if (inputArr[1].equals(LEAVE)) {
                log.remove(inputArr[0]);
            }
        }

        log.stream()
                .sorted(Comparator.comparing(String::valueOf).reversed())
                .forEach(System.out::println);

        br.close();
        bw.flush();
        bw.close();
    }
}
