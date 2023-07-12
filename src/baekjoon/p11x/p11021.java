package baekjoon.p11x;

import java.util.Scanner;

public class p11021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int size = Integer.parseInt(n);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            n = in.nextLine();
            String[] num = n.split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            result[i] = a+b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + (i+1) + ": " + result[i]) ;
        }
    }
}
