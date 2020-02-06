package baekjoon;

import java.util.Scanner;

public class p2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] mid = new int[3];

        String input = in.nextLine();
        int num1 = Integer.parseInt(input);
        input = in.nextLine();
        int num2 = Integer.parseInt(input);

        int result = num1*num2;

        mid[2] = num1 * (num2/100);
        num2 = num2%100;
        mid[1] = num1 * (num2/10);
        mid[0] = num1 * (num2%10);

        for (int i = 0; i < mid.length; i++) {
            System.out.println(mid[i]);
        }
        System.out.println(result);
    }
}
