package baekjoon;

import java.util.Scanner;

public class p1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int base = n;
		int count = 0;
		boolean stop = false;
		while (!stop) {
			int n1, n2;
			if (n > 9) {
				n1 = n/10;
				n2 = n%10;
			}
			else {
				n1 = 0;
				n2 = n;
			}
			n = (n2 * 10) + ((n1 + n2) % 10);
			if (n == base) {
				stop = true;
			}
			count++;
		}
		System.out.println(count);
		
		in.close();
	}
}
