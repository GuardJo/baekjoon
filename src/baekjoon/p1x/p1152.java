package baekjoon.p1x;

import java.util.Scanner;

public class p1152 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String[] str2 = str.split(" ");
		
		int count = 0;
		for (int i = 0; i < str2.length; i++) {
			if (str2[i].equals("")) {
				
			}
			else {
				count++;
			}
		}
		System.out.println(count);
		
		in.close();
	}
}
