package SkillCheckTest.Level02;

import java.util.Arrays;

/**
 * <h1>이모티콘 할인 행사</h1>
 * <p>프로그래머스 문제</p>
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150368">문제 링크</a>
 */
public class EmoticonDiscountEvent {
    private static int KAKAO_PLUS = 0;
    private static int TOTAL_PRICE = 0;

    public static void main(String[] args) {
        int[][] users = {{40, 10000}, {25, 10000}};
        int[] emoticon = {7000, 9000};

        int[] result = solution(users, emoticon);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[]{0, 0};
        int[] discountRate = {10, 20, 30, 40};
        int[] discountEmoticons = new int[emoticons.length];

        traverse(users, emoticons, 0, discountRate, discountEmoticons);

        answer = new int[]{KAKAO_PLUS, TOTAL_PRICE};

        return answer;
    }

    private static void traverse(int[][] users, int[] emoticons, int index, int[] discountRate, int[] discountEmoticons) {
        if (index == emoticons.length) {
            calculateDiscount(users, emoticons, discountEmoticons);
            return;
        }

        for (int discount : discountRate) {
            discountEmoticons[index] = discount;
            traverse(users, emoticons, index + 1, discountRate, discountEmoticons);
        }
    }

    private static void calculateDiscount(int[][] users, int[] emoticons, int[] discountEmoticons) {
        int allTotal = 0;
        int allPlus = 0;
        for (int[] user : users) {
            int totalPrice = 0;
            int plusCount = 0;
            int limitDiscount = user[0];
            int limitPrice = user[1];

            for (int i = 0; i < emoticons.length; i++) {
                if (limitDiscount <= discountEmoticons[i]) {
                    totalPrice += emoticons[i] * (100 - discountEmoticons[i]) / 100;
                }
            }

            if (totalPrice >= limitPrice) {
                plusCount++;
                allPlus += plusCount;
            } else {
                allTotal += totalPrice;
            }
        }

        checkBiggest(allPlus, allTotal);
    }

    private static void checkBiggest(int kakaoPlus, int totalPrice) {
        if (kakaoPlus > KAKAO_PLUS) {
            KAKAO_PLUS = kakaoPlus;
            TOTAL_PRICE = totalPrice;
        } else if (kakaoPlus == KAKAO_PLUS && totalPrice > TOTAL_PRICE) {
            TOTAL_PRICE = totalPrice;
        }
    }
}
