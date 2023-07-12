package SkillCheckTest.Level02;

import java.util.List;

/**
 * <h1>택배 배달과 수거하기</h1>
 * <p>프로그래머스 문제</p>
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150369">문제 링크</a>
 */
public class DeliveryAndPickup {
    public static int MAX_CAP = Integer.MAX_VALUE;
    public static boolean IS_CLEAN = false;
    public static int ANSWER = 0;

    public static void main(String[] args) {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        long result = solution(cap, n, deliveries, pickups);

        System.out.println(result);
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        MAX_CAP = cap;
        int startCap = getStartCap(cap, n, deliveries);
        int endIndex = deliveries.length - 1;

        while (true) {
            if (IS_CLEAN) {
                endIndex--;
            }

            endIndex = traverse(endIndex, startCap, deliveries, pickups);

            if (endIndex < 0) {
                break;
            } else {
                ANSWER += endIndex + 1;
            }

            startCap = cap;
        }

        return ANSWER;
    }

    private static int traverse(int endIndex, int deliveryCount, int[] deliveries, int[] pickups) {
        int index = endIndex;
        ANSWER += index + 1;

        for (int i = index; i >= 0; i--) {
            while (deliveries[i] > 0 && deliveryCount > 0) {
                deliveries[i]--;
                deliveryCount--;
            }

            while (pickups[i] > 0 && deliveryCount <= MAX_CAP) {
                pickups[i]--;
                deliveryCount++;
            }

            if (deliveryCount > MAX_CAP) {
                index = i;
                break;
            }

            ANSWER++;
        }

        if (index == 0 && deliveries[index] == 0 && pickups[index] == 0) {
            return -1;
        }

        if (deliveries[index] == 0 || pickups[index] == 0) {
            IS_CLEAN = true;
        } else {
            IS_CLEAN = false;
        }

        return index;
    }

    private static int getStartCap(int cap, int n, int[] deliveries) {
        int value = 0;

        for (int i = n - 1; i >= 0; i--) {
            int delivery = deliveries[i];

            if ((value + delivery) <= cap) {
                value += delivery;
            } else {
                break;
            }
        }

        return value == 0 ? cap : value;
    }
}
