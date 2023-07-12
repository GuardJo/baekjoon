package baekjoon.p10x;

import java.util.ArrayList;
import java.util.Scanner;

public class p10951 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        while(in.hasNextLine()) {
            String s = in.nextLine();
                String[] str = s.split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                list.add(a + b);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        in.close();
    }
}
