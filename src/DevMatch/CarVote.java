package DevMatch;

import java.util.*;

public class CarVote {
    public static void main(String[] args) {
        String[] votes = {"AVANT", "PRIDO", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "AVANT", "SONATE", "RAIN", "MONSTER", "GRAND", "SONATE", "SOULFUL", "AVANT", "SANTA"};
        int k = 2;

        String result = solution(votes, k);
        System.out.println(result);
    }

    static class Car implements Comparable<Car> {
        String name;
        int count;
        public Car(String name, int count) {
            this.name = name;
            this.count = count;
        }
        public String getName() {
            return this.name;
        }
        public int getCount() {
            return  this.count;
        }
        @Override
        public int compareTo(Car c) {
            if (this.count < c.getCount()) {
                return 1;
            }
            else if (this.count > c.getCount()) {
                return -1;
            }
            else {
                return this.name.compareTo(c.getName());
            }
        }
    }
    private static String solution(String[] votes, int k) {
        List<Car> list = new ArrayList<>();
        String answer = "";
        Arrays.sort(votes);
        int limitCount = 0;
        int removeCount = 0;

        String tmp = votes[0];
        int count = 1;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i].equals(tmp)) {
                count++;
            }
            else {
                list.add(new Car(tmp, count));
                count = 1;
                tmp = votes[i];
            }
        }
        list.add(new Car(tmp, count));

        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            limitCount += list.get(i).getCount();
        }

        int index = list.size();
        while (removeCount < limitCount) {
            index--;
            removeCount += list.get(index).getCount();
        }
        answer = list.get(index+1).getName();

        return answer;
    }
}
