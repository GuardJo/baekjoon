package SkillCheckTest.Level02;

import java.util.ArrayList;
import java.util.Arrays;

public class SkillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String skill_trees[] = {"BACDE", "CBADF", "AECB", "BDA", "CBDA"};
        int answer = solution(skill, skill_trees);

        System.out.println(answer);

    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String[] str = skill_trees[i].split("");
            int strCount = 0;
            ArrayList<String> list = new ArrayList<>(Arrays.asList(skill.split("")));

            for (int j = 0; j < str.length; j++) {
                if (list.contains(str[j])) {
                    if (list.get(0).equals(str[j])) {
                        list.add(list.remove(0));
                        strCount++;
                    }
                    else {
                        break;
                    }
                }
                else {
                    strCount++;
                }
            }
            if (str.length == strCount) {
                answer++;
            }
        }

        return answer;
    }
}
