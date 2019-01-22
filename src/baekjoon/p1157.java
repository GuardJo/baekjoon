package baekjoon;

import java.util.Scanner;

public class p1157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		str = str.toUpperCase();
		char[] c = str.toCharArray();
		int[] alpha = new int[26];
		
		for (int i = 0; i < c.length; i++) {
			int a = (int)c[i] -65;
			alpha[a]++;
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < alpha.length; i++) {
			if (max < alpha[i]) {
				max = alpha[i];
				maxIndex = i;
			}
		}
		
		for (int i = 0; i < alpha.length; i++) {
			if (max == alpha[i] && maxIndex != i) {
				System.out.println("?");
				System.exit(0);
			}
		}
		
		System.out.println((char)(maxIndex+65));
		
		in.close();
	}
}
