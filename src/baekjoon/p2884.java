package baekjoon;

import java.util.Scanner;

public class p2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] s = str.split(" ");
        int hour = Integer.parseInt(s[0]);
        int minuit = Integer.parseInt(s[1]);
        int number = 45;
        minuit = minuit - number;

        if (minuit < 0) {
            minuit = 60 + minuit;
            hour = hour - 1;
            if (hour < 0) {
                hour = 24 + hour;
            }
        }

        System.out.println(hour + " " + minuit);

        in.close();

    }
}
