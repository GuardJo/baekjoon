package kakao2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MakeCourseMenu {
    public static void main(String[] args) {
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2, 3, 4};

        String[] result = solution(orders, course);

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Integer> countList = new ArrayList<>();
            for (int j = 0; j < orders.length; j++) {
                String[] menu = orders[j].split("");
                Arrays.sort(menu);
                for (int k = 0; k < menu.length; k++) {
                    searchBase(list, countList, "", k, course[i], menu, orders);

                }
            }
            if (!list.isEmpty()) {
                ArrayList<Integer> max = new ArrayList<>();
                max.addAll(countList);
                Collections.sort(max);
                int maxNum = max.get(max.size() - 1);
                for (int j = 0; j < countList.size(); j++) {
                    if (countList.get(j) == maxNum) {
                        result.add(list.get(j));
                    }
                }
            }
            list.clear();
        }
        Collections.sort(result);
        answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private static int findMenu(String s, String[] orders) {
        String[] str = s.split("");
        int count = 0;
        for (int i = 0; i < orders.length; i++) {
            boolean isFind = true;
            for (int j = 0; j < str.length; j++) {
                if (!orders[i].contains(str[j])) {
                    isFind = false;
                }
            }
            if (isFind) {
                count++;
            }
        }
        return count;
    }

    private static void searchBase(ArrayList<String> lIst, ArrayList<Integer> countList,  String s, int index, int r, String[] menu, String[] orders) {
        s += menu[index];
        if (s.length() == r) {
            int count = findMenu(s, orders);
            if (count > 1) {
                if (!lIst.contains(s)) {
                    lIst.add(s);
                    countList.add(count);
                }
            }
        }
        else if (index >= menu.length) {
            return ;
        }
        else {
            for (int i = index + 1; i < menu.length; i++) {
                searchBase(lIst, countList, s, i, r, menu, orders);
            }
        }
    }
}
