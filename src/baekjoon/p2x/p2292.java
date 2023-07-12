package baekjoon.p2x;

import java.util.Scanner;

public class p2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int index = in.nextInt();
        int room = 6;
        int result = 1;

        int count = 1;
        while (index > result) {
            result = result + (room * count);
            count++;
        }
        System.out.println(count);

    }
}
