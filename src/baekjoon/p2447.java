package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2447 {
	public static String makeStar(int n, int c) {
		if (c < 1) {
			return "\n";
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			return makeStar(n, c-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int number = Integer.parseInt(br.readLine());

		bw.append(makeStar(number, number));

		br.close();
		bw.flush();
		bw.close();
	}
}
