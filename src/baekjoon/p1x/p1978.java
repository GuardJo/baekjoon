package baekjoon.p1x;

import java.util.Scanner;

public class p1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = 0;
		
		size = Integer.parseInt(in.nextLine());
		
		String s = in.nextLine();
		String[] str = s.split(" ");
		int[] number = new int[size];
		int count = 0;
		
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(str[i]);
		}
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 1) {
				boolean prime = true;
				int j = 2;
				while (prime) {
					if (number[i] % j == 0) {
						if (number[i] == j) {
							count++;
						}
						prime = false;
					}
					j++;
				}
				
			}
		}
		
		System.out.println(count);
		in.close();
	}
}
