package baekjoon.p10x;


import java.util.Arrays;
import java.util.Scanner;

public class p10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int size = Integer.parseInt(str);
        int[] num = new int[size];

        str = in.nextLine();
        String[] numbers = str.split(" ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[size-1]);
        in.close();
    }
}
