package uplus;

/**
 * 자리 방향 바꾸기 (최소로)
 */
public class p3 {
    private static class Solution {
        public int solution(String[] train) {
            int answer = 0;
            String[][] trains = new String[train.length][train[0].length()];

            for (int i = 0; i < train.length; i++) {
                String[] str = train[i].split("");
                for (int j = 0; j < str.length; j++) {
                    trains[i][j] = str[j];
                }
            }

            for (int i = 0; i < trains.length; i++) {
                for (int j = 0; j < trains[i].length; j++) {
                    if (isNeedChangeDirection(i, j, trains)) {
                        answer++;
                    }
                }
            }

            answer = answer / 2;

            return answer;
        }

        private boolean isNeedChangeDirection(int x, int y, String[][] trains) {
            String reverseDirection = "";

            switch (trains[x][y]) {
                case "E" :
                    reverseDirection = "W";
                    break;
                case "W" :
                    reverseDirection = "E";
                    break;
                case "N" :
                    reverseDirection = "S";
                    break;
                case "S" :
                    reverseDirection = "N";
                    break;
            }

            if ((y + 1 < trains[0].length) && trains[x][y + 1].equals(reverseDirection)) {
                return true;
            }
            else if ((y - 1 >= 0) && trains[x][y - 1].equals(reverseDirection)) {
                return true;
            }
            else if ((x + 1 < trains.length) && trains[x + 1][y].equals(reverseDirection)) {
                return true;
            }
            else if ((x - 1 >= 0) && trains[x - 1][y].equals(reverseDirection)) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        String[] train = {"ESS", "EEW", "NNW"};
        int result = new Solution().solution(train);

        System.out.println(result);
    }
}
