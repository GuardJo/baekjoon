package baekjoon.p3x;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();
		
		String[] str1 = s1.split(" ");
		String[] str2 = s2.split(" ");
		String[] str3 = s3.split(" ");
		
		int x1 = Integer.parseInt(str1[0]);
		int x2 = Integer.parseInt(str2[0]);
		int x3 = Integer.parseInt(str3[0]);
		int y1 = Integer.parseInt(str1[1]);
		int y2 = Integer.parseInt(str2[1]);
		int y3 = Integer.parseInt(str3[1]);
		
		int resultX = 0;
		int resultY = 0;
		
		if (x1 == x2) {
			resultX = x3;
		}
		else if (x2 == x3) {
			resultX = x1;
		}
		else {
			resultX = x2;
		}
		
		if (y1 == y2) {
			resultY = y3;
		}
		else if(y2 == y3) {
			resultY = y1;
		}
		else {
			resultY = y2;
		}
		
		bw.append(resultX + " " + resultY + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
