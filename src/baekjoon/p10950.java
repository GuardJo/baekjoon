package baekjoon;

import java.util.Scanner;

public class p10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int num = Integer.parseInt(n);
        int[] answer = new int[num];

        String str;
        String[] s;
        for (int i = 0; i < num; i++) {
            str = in.nextLine();
            s = str.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            answer[i] = a+b;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
