package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int sum = 0;
			String s = br.readLine();
			sum = Integer.parseInt(s.split(" ")[0]) + Integer.parseInt(s.split(" ")[1]);
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
