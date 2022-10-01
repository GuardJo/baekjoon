package uplus;

import java.util.HashMap;
import java.util.Map;

/**
 * 토너먼트
 */
public class p4 {
    private static class Solution {
        public int solution(int[] players) {
            int answer = 0;
            int mostIndex = 0;
            int mostDistance = 0;
            Map<Integer, Integer> map = new HashMap<>();
//            int notMatchCount = 0;
//            for (int i = 0; i < players.length; i+=2) {
//                if (players[i] == 0 && players[i + 1] == 0) {
//                    notMatchCount++;
//                    players[i] = 1;
//                    int count = getMatchCount(players);
//
//                    if (count > answer) {
//                        answer = count;
//                    }
//
//                    players[i] = 0;
//                }
//            }

            for (int i = 0; i < players.length; i++) {
                if (players[i] == 0) {
                    int distance = checkMostThings(i, players);
                    if (mostDistance > distance) {
                        mostIndex = i;
                        mostDistance = distance;
                    }
                }
            }

            players[mostIndex] = 1;

            answer = getMatchCount(players);

            return answer;
        }
        private int checkMostThings(int index, int[] arr) {
            int distance = Integer.MAX_VALUE;

            for (int i = index; i >= 0; i--) {
                if (arr[i] == 1) {
                    if (i < distance) {
                        distance = i;
                        break;
                    }
                }
            }

            for (int i = index; i < arr.length; i++) {
                if (arr[i] == 1) {
                    if (i < distance) {
                        distance = i;
                        break;
                    }
                }
            }

            return distance;
        }

        private int getMatchCount(int[] arr) {
            int[] arr2 = new int[arr.length / 2];
            int count = 0;

            if (arr2.length == 1) {
                return 1;
            }

            int index = 0;
            for (int i = 0; i < arr.length; i+=2) {
                if (arr[i] == 1 || arr[i + 1] == 1) {
                    arr2[index] = 1;
                    count++;
                }
                index++;
            }

            return count + getMatchCount(arr2);
        }
    }

    public static void main(String[] args) {
        int[] players = {1, 0, 1, 0, 0, 0, 0, 0};
        int result = new Solution().solution(players);

        System.out.println(result);
    }
}
