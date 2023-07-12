package baekjoon.p3x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int r = Integer.parseInt(br.readLine());
		
		double u, taxi;
		
		u = Math.PI * Math.pow(r, 2);
		taxi = 2 * Math.pow(r, 2);
		
		bw.append(String.format("%.6f", u) + "\n");
		bw.append(String.format("%.6f", taxi) + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
