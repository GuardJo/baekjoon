package SkillCheckTest.Level02_3;

import java.util.ArrayList;

public class NewsClustering {
    public static void main(String[] args) {
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        int result = solution(str1, str2);
        System.out.println(result);
    }

    private static int solution(String str1, String str2) {
        int answer = 0;
        double interSectionSize = 0;
        str1 = str1.toUpperCase();
        char[] c1 = str1.toCharArray();
        ArrayList<String> a = new ArrayList<>();
        str2 = str2.toUpperCase();
        char[] c2 = str2.toCharArray();
        ArrayList<String> b = new ArrayList<>();
        double unionSize = 0;

        for (int i = 0; i < c1.length-1; i++) {
            char tmp1 = c1[i];
            char tmp2 = c1[i+1];
            if (tmp1 >= 'A' && tmp1 <= 'Z' && tmp2 >= 'A' && tmp2 <= 'Z') {
                String s = Character.toString(c1[i]) + Character.toString(c1[i+1]);
                a.add(s);
            }
        }

        for (int i = 0; i < c2.length-1; i++) {
            char tmp1 = c2[i];
            char tmp2 = c2[i+1];
            if (tmp1 >= 'A' && tmp1 <= 'Z' && tmp2 >= 'A' && tmp2 <= 'Z') {
                String s = Character.toString(tmp1) + Character.toString(tmp2);
                b.add(s);
            }
        }
        unionSize = (a.size() + b.size());

        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                b.remove(a.get(i));
                interSectionSize++;
            }
        }
        unionSize -= interSectionSize;
        double tmp = 0;
        if (interSectionSize <= 0 && unionSize <= 0) {
            tmp = 1 * 65536;
        }
        else {
            tmp = (interSectionSize / unionSize) * 65536;
        }
        answer = (int) tmp;

        return answer;
    }
}
