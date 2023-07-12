package baekjoon.p2x;

import java.util.Scanner;

public class p2941 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = in.nextLine();
		for (int i = 0; i < croatia.length; i++) {
			str = str.replaceAll(croatia[i], "0");
		}
		String[] str2 = str.split("");
		System.out.println(str2.length);
		
		in.close();
	}
}
