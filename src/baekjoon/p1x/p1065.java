package baekjoon.p1x;

import java.util.Scanner;

public class p1065 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (hansu(i)) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
	
	public static boolean hansu (int num) {
		if (num >= 1 && num < 100) {
			return true;
		}
		else {
			int n1, n2, n3;
			n1 = num/100;
			num = num%100;
			n2 = num/10;
			n3 = num%10;
			if (n1-n2 == n2-n3) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
