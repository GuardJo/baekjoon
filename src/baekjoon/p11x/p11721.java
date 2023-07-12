package baekjoon.p11x;

import java.util.Scanner;

public class p11721 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			char[] c = str.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				if (i % 10 == 0 && i != 0) {
					System.out.println();
				}
				System.out.print(c[i]);
			}
		}
		in.close();
	}
}
