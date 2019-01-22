package baekjoon;

import java.util.Scanner;

public class p5622 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] alpha = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};
		
		String[] str = in.nextLine().split("");
		int[] number = new int[str.length];
		
		int time = 0;
		for (int i = 0; i < str.length; i++) {
			number[i] = alpha[str[i].hashCode()-65];
			time += number[i]+1;
		}
		
		System.out.println(time);
		in.close();
	}
}
