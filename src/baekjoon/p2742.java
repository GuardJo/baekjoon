package baekjoon;

import java.util.Scanner;

public class p2742 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			int n = in.nextInt();
			
			for (int i = n; i > 0; i--) {
				System.out.println(i);
			}
		}
		
		in.close();
	}
}
