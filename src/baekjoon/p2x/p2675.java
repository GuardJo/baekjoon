package baekjoon.p2x;

import java.util.Scanner;

public class p2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int count = Integer.parseInt(in.nextLine());

		for (int i = 0; i < count; i++) {
			String str2 = in.nextLine();
			String[] str = str2.split(" ");
			int number = Integer.parseInt(str[0]);
			String[] word = str[1].split("");
			String word2 = "";
			for (int j = 0; j < word.length; j++) {
				for (int k = 0; k < number; k++) {
					word2 += word[j];
				}
			}
			System.out.println(word2);
		}
		
		in.close();
	}
}
