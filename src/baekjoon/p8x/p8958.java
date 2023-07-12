package baekjoon.p8x;

import java.util.Scanner;

public class p8958 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < size; i++) {
			String str = in.nextLine();
			String[] str2 = str.split("");
			int count = 0;
			int sum = 0;
			for (int j = 0; j < str2.length; j++) {
				if (str2[j].equals("O")) {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
