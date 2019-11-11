package baekjoon;

import java.util.Scanner;

public class p1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] s = str.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if (a > b) {
            System.out.println(">");
        }
        else if(a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }

        in.close();
    }
}
