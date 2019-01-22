package baekjoon;

import java.util.Scanner;

public class p10809 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		String[] str2 = str.split("");
		int[] alpha = new int[26];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}

		for (int i = 0; i < str2.length; i++) {
			int a = str2[i].hashCode()-97;
			if (alpha[a] == -1) {
				alpha[a] = i;
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
		
		in.close();
	}
}
