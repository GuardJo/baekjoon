package baekjoon.p2x;

import java.util.Arrays;
import java.util.Scanner;

public class p2920 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};
		
		String[] str = in.nextLine().split(" ");
		int[] number = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			number[i] = Integer.parseInt(str[i]);
		}
		if (Arrays.equals(number, ascending)) {
			System.out.println("ascending");
		}
		else if (Arrays.equals(number, descending)) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		
		in.close();
	}
}
