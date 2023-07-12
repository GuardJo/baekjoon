package baekjoon.p1x;

import java.util.Scanner;

public class p1924 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		while (in.hasNext()) {
			String days = in.nextLine();
			int m = Integer.parseInt(days.split(" ")[0]);
			int d = Integer.parseInt(days.split(" ")[1]);
			
			int day = 1;
			int last = 30;
			for (int i = 1; i <= m; i++) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
					last = 31;
				}
				else if (i == 2) {
					last = 28;
				}
				else {
					last = 30;
				}
				for (int j = 1; j <= last; j++) {
					if (day > week.length-1) {
						day = 0;
					}
					if (i == m && j == d) {
						System.out.println(week[day]);
						System.exit(0);
					}
					day++;
				}
			}
			
		}
		
		in.close();
	}
}
