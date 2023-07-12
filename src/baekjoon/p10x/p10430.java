package baekjoon.p10x;

import java.util.Scanner;

public class p10430 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			int c = Integer.parseInt(str.split(" ")[2]);
			
			System.out.println((a+b)%c);
			System.out.println((a%c + b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c*b%c)%c);
		}
		in.close();
	}
}
