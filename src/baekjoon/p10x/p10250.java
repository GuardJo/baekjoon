package baekjoon.p10x;

import java.util.Scanner;

public class p10250 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ss = in.nextLine();
		int count = Integer.parseInt(ss);
		
		for (int i = 0; i < count; i++) {
			String s = in.nextLine();
			String[] str = s.split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			int floor = 0;
			int number = 0;
			
			if (n <= h) {
				number = 1;
				floor = n;
			}
			else {
				int temp = n/h;
				if (n % h != 0) {
					number = temp + 1;
					floor = n - (h * temp); 
				}
				else {
					number = temp;
					floor = n / number;
				}
			}
			
			int result = (floor * 100) + number;
			System.out.println(result);
		}
	}
}
