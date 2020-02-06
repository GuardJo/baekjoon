package baekjoon;

import java.util.Scanner;

public class p2775 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s;
		s = in.nextLine();
		int count = Integer.parseInt(s);
		
		for (int num = 0; num < count; num++) {
			int k = Integer.parseInt(in.nextLine());
			int n = Integer.parseInt(in.nextLine());
			
			int[][] room = new int[k+1][n+1];
			
			for (int i = 0; i < room.length; i++) {
				for (int j = 0; j < room[0].length; j++) {
					if (i == 0) {
						room[i][j] = j;
					}
					else {
						int total = 0;
						for (int m = 1; m <= j; m++) {
							total += room[i-1][m];
						}
						room[i][j] = total;
						total = 0;
					}
				}
			}
			
			System.out.println(room[k][n]);
		}
	}
}
