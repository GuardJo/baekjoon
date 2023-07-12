package baekjoon.p10x;

import java.util.Scanner;

public class p10817 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		int a = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		int c = Integer.parseInt(input.split(" ")[2]);
		
		if ((a >= b && a <= c) || (a >= c && a <= b)) {
			System.out.println(a);
		}
		else if ((b >= a && b <= c) || (b >= c && b <= a)) {
			System.out.println(b);
		}
		else if ((c >= a && c <= b) || (c >= b && c <= a)) {
			System.out.println(c);
		}
		
		in.close();
	}
}	
