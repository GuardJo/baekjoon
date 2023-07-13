package baekjoon.p25x;

import java.io.*;

/**
 * <h1>영수증</h1>
 * <p>백준 문제</p>
 * <a href="https://www.acmicpc.net/problem/25304">문제 링크</a>
 */
public class p25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String totalPrice = bufferedReader.readLine();
        String totalCount = bufferedReader.readLine();
        String[] input = new String[Integer.parseInt(totalCount)];

        for (int i = 0; i < input.length; i++) {
            input[i] = bufferedReader.readLine();
        }

        String answer = solution(totalPrice, input);

        bufferedWriter.write(answer);

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String solution(String totalPrice, String[] input) {
        int price = 0;

        for (String s : input) {
            String[] arr = s.split(" ");
            int itemPrice = Integer.parseInt(arr[0]);
            int itemCount = Integer.parseInt(arr[1]);

            price += itemPrice * itemCount;
        }

        return (totalPrice.equals(String.valueOf(price))) ? "Yes" : "No";
    }
}
