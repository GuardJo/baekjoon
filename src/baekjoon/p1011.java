package baekjoon;

import java.util.Scanner;

public class p1011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int size = Integer.parseInt(s);
        long [] result = new long[size];

        for (int i = 0; i < size; i++) {
            s = in.nextLine();
            String[] str = s.split(" ");
            long start = Integer.parseInt(str[0]);
            long finish = Integer.parseInt(str[1]);

            long base = finish-start;
            long index = 1;
            long point = 1;
            long count = 0;

            while (index < base) {
                count++;
                point++;
                index += count;
                if (index >= base) {
                    break;
                }
                point++;
                index += count;
                if(index >= base) {
                    break;
                }
            }
            if (index > base) {
                point--;
            }
            result[i] = point;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        in.close();
    }
}
