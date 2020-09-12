package kakao2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MakeCompany {
    public static void main(String[] args) {
        int[] sales = {};
        int[][] links = {{10, 8}, {1, 9}, {9, 7}, [5, 4], [1, 5], [5, 10], [10, 6], [1, 3], [10, 2]];

        int result = solution(sales, links);
    }


    private static int solution(int[] sales, int[][] links) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < links.length; i++) {
            set.add(links[i][0]);
        }

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        return answer;
    }
}
