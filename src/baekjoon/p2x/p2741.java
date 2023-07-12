package baekjoon.p2x;

import java.util.Scanner;

public class p2741 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			int n = in.nextInt();
			
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
