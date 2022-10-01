package SkillCheckTest.Level01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 프로그래머스 level1
 * 신고 결과 받기
 */
public class ReportResultReceiver {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = new Solution().solution(id_list, report, k);

        System.out.println(Arrays.toString(result));
    }

    private static class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            report = Arrays.stream(report).collect(Collectors.toSet()).toArray(new String[1]);
            Map<String, List<String>> idMap = new HashMap<>();
            Map<String, Integer> reportMap = new HashMap<>();
            int[] answer = new int[id_list.length];

            for (String id : id_list) {
                idMap.put(id, new ArrayList<>());
                reportMap.put(id, 0);
            }

            for (String reportIds : report) {
                String[] ids = reportIds.split(" ");
                idMap.get(ids[0]).add(ids[1]);
                reportMap.replace(ids[1], reportMap.get(ids[1]) + 1);
            }

            for (int i = 0; i < id_list.length; i++) {
                for (String id : idMap.get(id_list[i])) {
                    if (reportMap.get(id) >= k) {
                        answer[i]++;
                    }
                }
            }

            return answer;
        }
    }
}
