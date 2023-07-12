package baekjoon.p10x;

import java.io.*;
import java.math.BigInteger;

public class p10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();

        String result = solution(str);

        writer.write(result);

        reader.close();
        writer.flush();
        writer.close();

    }

    public static String solution(String input) {
        String result = "";
        String[] splitArr = input.split(" ");

        BigInteger num1 = new BigInteger(splitArr[0]);
        BigInteger num2 = new BigInteger(splitArr[1]);


        result = num1.add(num2).toString();

        return result;
    }
}
