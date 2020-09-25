package NTS;

public class Flower {
    public static void main(String[] args) {
        int[][] flowers = 	{{3, 4} ,{4, 5}, {6, 7}, {8, 10}};
        int result = solution(flowers);
        System.out.println(result);
    }

    private static int solution(int[][] flowers) {
        int answer = 0;
        int maxDay = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (maxDay < flowers[i][1]) {
                maxDay = flowers[i][1];
            }
        }
        int [] days = new int[maxDay];

        for (int i = 0; i < flowers.length; i++) {
            int start = flowers[i][0];
            int end = flowers[i][1];
            for (int j = start; j < end; j++) {
                days[j]++;
            }
        }

        for (int i = 0; i < days.length; i++) {
            if (days[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
}
