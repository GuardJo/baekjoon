package SkillCheckTest.Level01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * <h1>개인정보 수집 유효기간</h1>
 * <p>프로그래머스 문제</p>
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150370">문제 링크</a>
 */
public class PrivacyExpireTime {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int[] result = solution(today, terms, privacies);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = initTermsMap(terms);
        List<Integer> list = new ArrayList<>();
        int count = 1;

        for (String privacy : privacies) {
            String[] arr = privacy.split(" ");
            LocalDate date = parsDate(arr[0]);
            String key = arr[1];
            int expiringMonthCount = termsMap.get(key);

            LocalDate expireDate = calcExpiredTime(date, expiringMonthCount);
            LocalDate now = parsDate(today);

            if (expireDate.isBefore(now)) {
                list.add(count);
            }

            count++;
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static Map<String, Integer> initTermsMap(String[] terms) {
        Map<String, Integer> termsMap = new HashMap<>();

        Arrays.stream(terms).forEach((term) -> {
            String[] sepherateTerm = term.split(" ");
            String termsType =  sepherateTerm[0];
            int time = Integer.parseInt(sepherateTerm[1]);

            termsMap.put(termsType, time);
        });

        return termsMap;
    }

    private static LocalDate parsDate(String day) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate localDate = LocalDate.parse(day, dateTimeFormatter);

        return checkMaxDay(localDate);
    }

    private static LocalDate calcExpiredTime(LocalDate date, int month) {
        LocalDate result = date.plusMonths(month).minusDays(1);

        return checkMaxDay(result);
    }

    private static LocalDate checkMaxDay(LocalDate localDate) {
        int maxDay = 28;

        if (localDate.getDayOfMonth() > maxDay) {
            localDate.withDayOfMonth(maxDay);
        }

        return localDate;
    }
}
