package baekjoon.p1x;

import java.util.Scanner;

public class p1546 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = Integer.parseInt(in.nextLine());
		String[] input = in.nextLine().split(" ");
		float maxScore = 0;
		float[] score = new float[n];
		for (int i = 0; i < n; i++) {
			score[i] = Float.parseFloat(input[i]);
			if (maxScore <= score[i]) {
				maxScore = score[i];
			}
		}
		float average = 0;
		for (int i = 0; i < n; i++) {
			score[i] = score[i]/maxScore*100;
			average += score[i];
		}
		average = average/n;
		System.out.println(average);
		
		in.close();
	}
}
