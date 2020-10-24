package Talentinum.Test;

import java.io.*;

public class p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        String result = lastLetters(word);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String lastLetters(String word) {
        String answer = "";
        String[] str = word.split("");
        answer += str[str.length-1] + " ";
        answer += str[str.length-2];
        return answer;
    }
}
