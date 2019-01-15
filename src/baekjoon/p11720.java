package baekjoon;

import java.util.Scanner;

public class p11720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int n = Integer.parseInt(in.nextLine());
			String number = in.nextLine();
			String[] num = number.split("");
			
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Integer.parseInt(num[i]);
			}
			
			System.out.println(sum);
		}
		
		in.close();
	}
}
