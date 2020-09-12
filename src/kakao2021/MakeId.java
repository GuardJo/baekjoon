package kakao2021;

public class MakeId {
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";

        String result = solution(new_id);

        System.out.println(result);
    }

    private static String solution(String new_id) {
        String answer = "";
        String tmp = new_id.toLowerCase();
        char[] tmp_arr = tmp.toCharArray();
        tmp = "";
        for (int i = 0; i < tmp_arr.length; i++) {
            if ((tmp_arr[i] >= 'a' && tmp_arr[i] <= 'z') || (tmp_arr[i] >= '0' && tmp_arr[i] <= '9')|| tmp_arr[i] == '-' || tmp_arr[i] == '_' || tmp_arr[i] == '.') {
                tmp += tmp_arr[i];
            }
        }
        if (tmp.length() > 0) {
            answer = tmp;
        }
        tmp_arr = tmp.toCharArray();
        tmp = "";
        for (int i = 0; i < tmp_arr.length-1; i++) {
            if (tmp_arr[i] == '.' && tmp_arr[i+1] == '.') {
                continue;
            }
            tmp += tmp_arr[i];
        }
        if (tmp.length() > 0) {
            answer = tmp;
        }
        tmp += tmp_arr[tmp_arr.length-1];
        tmp_arr = tmp.toCharArray();
        tmp = "";
        for (int i = 0; i < tmp_arr.length; i++) {
            if (i == 0 && tmp_arr[i] == '.') {
                continue;
            }
            if (i == tmp_arr.length-1 && tmp_arr[i] == '.') {
                continue;
            }
            tmp += tmp_arr[i];
        }
        if (tmp.length() > 0) {
            answer = tmp;
        }

        if (tmp.length() == 0) {
            tmp += "a";
        }
        if (tmp.length() > 0) {
            answer = tmp;
        }

        tmp_arr = tmp.toCharArray();
        tmp = "";
        if (tmp_arr.length >= 16) {
            for (int i = 0; i < 15; i++) {
                tmp += tmp_arr[i];
            }
            tmp_arr = tmp.toCharArray();
            tmp = "";
            for (int i = 0; i < tmp_arr.length; i++) {
                if (i == 0 && tmp_arr[i] == '.') {
                    continue;
                }
                if (i == tmp_arr.length-1 && tmp_arr[i] == '.') {
                    continue;
                }
                tmp += tmp_arr[i];
            }
        }
        else if (tmp_arr.length <= 2) {
            for (int i = 0; i < tmp_arr.length; i++) {
                tmp += tmp_arr[i];
            }
            while (tmp.length() < 3) {
                tmp += tmp_arr[tmp_arr.length-1];
            }
        }
        if (tmp.length() > 0) {
            answer = tmp;
        }

        return answer;
    }
}
