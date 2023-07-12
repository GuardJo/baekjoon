package baekjoon.p2x;

import java.util.Arrays;
import java.util.Scanner;

public class p2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 9;
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        int[] numbers2 = numbers.clone();
        Arrays.sort(numbers2);

        System.out.println(numbers2[size-1]);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers2[size-1]) {
                System.out.println(i+1);
            }
        }

        in.close();
    }
}
