package DevMatch;

public class TimeChange {
    public static void main(String[] args) {
        String p = "PM 11:59:59";
        int n = 1;
        String result = solution(p, n);

        System.out.println(result);
    }

    private static String solution(String p, int n) {
        String answer = "";
        String[] tmp = p.split(" ");
        String ampm = tmp[0];
        String[] time = tmp[1].split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);
        sec += n;

        if (ampm.equals("PM")) {
            if (hour != 12) {
                hour += 12;
            }
        }
        else {
            if (hour == 12) {
                hour = 0;
            }
        }

        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }

        if (min >= 60) {
            hour += min / 60;
            min = min % 60;
        }

        while (hour > 23) {
            hour -= 24;
        }

        if (hour < 10) {
            answer += "0";
        }

        answer += hour + ":";
        if (min < 10) {
            answer += "0";
        }
        answer += min + ":";
        if (sec < 10) {
            answer += "0";
        }
        answer += sec;
        return answer;
    }
}
