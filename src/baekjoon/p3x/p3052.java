package baekjoon.p3x;

import java.util.Arrays;
import java.util.Scanner;

public class p3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 10;
        int mod = 42;
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            int num = in.nextInt();
            number[i] = num%mod;
        }
        Arrays.sort(number);
        int count = 1;
        for (int i = 1; i < number.length; i++) {
            if (number[i-1] != number[i]) {
                count++;
            }
        }

        System.out.println(count);

        in.close();
    }
}
