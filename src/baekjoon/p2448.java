package baekjoon;

import java.util.Scanner;

public class p2448 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = in.nextInt();
		String[] star = {"  *  ", " * * ", "*****"};
		for(int i = 0; i < star.length; i++) {
			sb.append(star[i] + '\n');
		}
		makeStar(0, 0, num, sb);

		in.close();
	}

	public static void makeStar(int left, int right, int n, StringBuilder b) {
		for (int i = 0; i < left; i++) {
			b.append(" ");
		}
		
		for (int i = 0; i < right; i++) {
			b.append(" ");
		}
		if (n <= 3) {
			System.out.println(b.toString());
			System.exit(0);
		}
		makeStar(0, 0, n-(n/2), b);
	}
}
