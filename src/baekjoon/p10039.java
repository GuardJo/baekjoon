package baekjoon;

import java.util.Scanner;

public class p10039 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] score = new int[5];
		int average = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = in.nextInt();
			if (score[i] < 40) {
				score[i] = 40;
			}
			average += score[i];
		}
		average = average/score.length;
		System.out.println(average);
		in.close();
	}
}
