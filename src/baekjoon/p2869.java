package baekjoon;

import java.util.Scanner;

public class p2869 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        String s = in.nextLine();
        String[] str = s.split(" ");
        long a = Long.parseLong(str[0]);
        long b = Long.parseLong(str[1]);
        long v = Long.parseLong(str[2]);
        
        long one = a-b;
        v -= b;
        long count = v / one;
        if (v % one > 0) {
        	count++;
        }

        System.out.println(count);
        in.close();
    }
}
