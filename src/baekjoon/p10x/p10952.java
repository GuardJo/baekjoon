package baekjoon.p10x;

import java.util.ArrayList;
import java.util.Scanner;

public class p10952 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int a = 1;
        int b = 1;

        while (true) {
            String s = in.nextLine();
            String[] str = s.split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            if (a == 0 && b == 0) {
                break;
            }
            list.add(a+b);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        in.close();


    }
}
