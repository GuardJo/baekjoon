package baekjoon;

import java.util.Scanner;

public class p11022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int size = Integer.parseInt(s);
        int[] result = new int[size];
        int[] aa = new int[size];
        int[] bb = new int[size];

        for (int i = 0; i < size; i++) {
            s = in.nextLine();
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            aa[i] = a;
            int b = Integer.parseInt(str[1]);
            bb[i] = b;
            result[i] = a+b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + (i+1) + ": " + aa[i] + " + " + bb[i] + " = " + result[i]);
        }
        in.close();
    }
}
