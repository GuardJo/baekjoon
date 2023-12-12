package dec_12_2023;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class BirthDayGift {
    public static void main(String[] args) {
        String[] birthDays = {"0106", "0110", "0111"};

        long answer = solution(birthDays);

        System.out.println(String.valueOf(answer));
    }

    private static long solution(String[] birthdays) {
        long answer = 0L;
        LocalDate[] localDates = new LocalDate[birthdays.length];

        for (int i = 0; i < localDates.length; i++) {
            String str = "2023" + birthdays[i];

            localDates[i] = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyyMMdd"));
        }

        for (LocalDate date : localDates) {
            long count = Arrays.stream(localDates)
                    .filter(localDate -> {
                        int target = localDate.getDayOfYear();
                        int base = date.getDayOfYear();

                        int d = Math.abs(base - target);

                        return (d >= 5 && !(localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)));
                    })
                    .count();

            answer += count;
        }

        return answer;
    }
}
