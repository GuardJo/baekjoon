package baekjoon;

import java.util.Scanner;

public class p1001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			String str = in.nextLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);
			int result = a-b;
			int c = 0;
			System.out.println(result);
		}
		in.close();
	}
}	
