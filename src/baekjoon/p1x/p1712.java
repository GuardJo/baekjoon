package baekjoon.p1x;

import java.util.Scanner;

public class p1712 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] str = s.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        long count = 0;
        if (b >= c) {
            count = -1;
        }
        else {
            count = (a / (c - b)) + 1;
        }

        System.out.println(count);
    }
}
