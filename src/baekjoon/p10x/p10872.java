package baekjoon.p10x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p10872 {
	public static int factorial (int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		int result = factorial(number);
		
		bw.append(result + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
