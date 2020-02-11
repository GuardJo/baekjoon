package baekjoon;

import java.util.Scanner;

public class p4948 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int start = -1;
		boolean prime = true;

		while (start != 0) {
			start = in.nextInt();
			int end = start * 2;
			int count = 0;


			for (int i = start+1; i <= end; i++) {
				if (i < 2) {
					prime = false;
				}
				for (int j = 2; j <= Math.sqrt(end); j++) {
					if (i != j && i % j == 0) {
						prime = false;
						break;
					}
				}

				if (prime && i >= start) {
					count++;
				}
				prime = true;
			}

			if (count > 0) {
				System.out.println(count);
			}
		}

		in.close();
	}
}
