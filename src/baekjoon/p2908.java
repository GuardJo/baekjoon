package baekjoon;

import java.util.Scanner;

public class p2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] str = in.nextLine().split(" ");
		
		char[] c1 = str[0].toCharArray();
		char[] c11 = new char[c1.length];
		char[] c2 = str[1].toCharArray();
		char[] c22 = new char[c2.length];
		int index = c1.length-1;
		for (int i = 0; i < c1.length; i++) {
			c11[i] = c1[index];
			c22[i] = c2[index];
			index--;
		}
		int a = Integer.parseInt(String.valueOf(c11));
		int b = Integer.parseInt(String.valueOf(c22));
		if (a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		in.close();
		
	}
}
