package baekjoon.p2x;

import java.util.Scanner;

public class p2440 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = in.nextInt();

			for (int i = n; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		in.close();

	}
}
