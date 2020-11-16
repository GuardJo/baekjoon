package SkillCheckTest.Level01;

import java.io.*;

public class EncryptionOfPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String phone_number = br.readLine();
        String result = solution(phone_number);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();
    }

    private static String solution(String phone_number) {
        String answer = phone_number.substring(phone_number.length()-4);
        String s = "";

        for (int i = 0; i < phone_number.length()-4; i++) {
            s += "*";
        }
        answer = s += answer;

        return answer;
    }
}
