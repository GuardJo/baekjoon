package baekjoon;

import java.util.Scanner;

public class p1008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			double a = Integer.parseInt(str.split(" ")[0]);
			double b = Integer.parseInt(str.split(" ")[1]);
			double result = a/b;
			System.out.println(result);
		}
		
		in.close();
	}
}
