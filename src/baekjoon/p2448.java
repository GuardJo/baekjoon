package baekjoon;

import java.util.Scanner;

public class p2448 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] star =  new String[num];
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";

		if (num > 3) {
			makeStar(3, num, star);
		}
		for (int i = 0; i < star.length; i++) {
			System.out.println(star[i]);
		}
		in.close();
	}

	private static void makeStar(int start, int num, String[] star) {
		// TODO Auto-generated method stub
		
		for (int i = start; i < start * 2; i++) {
			star[i] = star[i-start] + " " + star[i-start];
		}
		String space = "";
		for (int i = 0; i < start; i++) {
			space += " ";
		}
		for (int i = 0; i < start; i++) {
			star[i] = space + star[i] + space;
		}
		if (start*2 == num) {
			return;
		}
		else {
			makeStar(start*2, num, star);
		}
	}

}
