package baekjoon;

import java.util.Scanner;

public class p11654 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int a = str.hashCode();
		System.out.println(a);
		
		in.close();
	}
}
