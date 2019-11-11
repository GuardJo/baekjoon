package baekjoon;

import java.util.Scanner;

public class p2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else {
            System.out.println("0");
        }
    }
}
