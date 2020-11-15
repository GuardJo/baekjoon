package MidasTest;


import java.util.ArrayList;
import java.util.Collections;

public class EatingCookies {
    static int max = 1;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] cookies = {1, 4, 2, 6, 5, 3};
        int k = 2;
        int[] result = solution(cookies, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] solution(int[] cookies, int k) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        for (int i = 0; i < cookies.length; i++) {
            arr.add(cookies[i]);
            Eating(arr, i, cookies);
            arr.remove(arr.size()-1);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() == max) {
                String s = "";
                for (int j = 0; j < list.get(i).size(); j++) {
                    s += list.get(i).get(j);
                }
                arr2.add(s);
            }
        }

        Collections.sort(arr2);
        String[] str = arr2.get(k - 1).split("");
        answer = new int[str.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }

        return answer;
    }

    private static void Eating(ArrayList<Integer> arr, int x, int[] cookies) {

        for (int i = x; i < cookies.length; i++) {
            if (arr.get(arr.size()-1) < cookies[i]) {
                arr.add(cookies[i]);
                Eating(arr, i, cookies);
                if (max < arr.size()) {
                    max = arr.size();
                }
                ArrayList<Integer> tmp = (ArrayList<Integer>) arr.clone();
                list.add(tmp);
                arr.remove(arr.size()-1);
            }
        }

    }


}
