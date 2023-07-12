package baekjoon.p2x;

import java.util.Scanner;

public class p2439 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			for (int i = 0; i < n; i++) {
				for (int k = i+1; k < n; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		in.close();

	}
}
