package FrienTripTest;

public class p1 {
    public static void main(String[] args) {
        int[][] location = 	{{0, 3}, {1, 1}, {1, 5}, {2, 2}, {3, 3}, {4, 0}};
        int[] s = {1, 4};
        int[] e = {4, 1};
        int result = solution(location, s, e);

        System.out.println(result + " ");
    }

    private static int solution(int[][] location, int[] s, int[] e) {
        int answer = 0;
        int minX = s[0];
        int minY = s[1];
        int maxX = e[0];
        int maxY = e[1];

        if (s[0] > e[0]) {
            maxX = s[0];
            minX = e[0];
        }
        if (s[1] > e[1]) {
            maxY = s[1];
            minY = e[1];
        }

        for (int i = 0; i < location.length; i++) {
            int x = location[i][0];
            int y = location[i][1];
            if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                answer++;
            }
        }
        return answer;
    }
}
