package baekjoon.p1x;

import java.util.Scanner;

public class p1193 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xCount = -1;
        int yCount = 1;
        int x = 1;
        int y = 1;
        int count = in.nextInt();

        for (int i = 1; i < count; i++) {
            x += xCount;
            y += yCount;
            if (x <= 0) {
                x += 1;
                xCount = 1;
                yCount = -1;
            }
            else if (y <= 0) {
                y += 1;
                xCount = -1;
                yCount = 1;
            }
        }
        System.out.println(x + "/" + y);
        in.close();
    }
}
