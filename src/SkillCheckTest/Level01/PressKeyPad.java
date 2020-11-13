package SkillCheckTest.Level01;

public class PressKeyPad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = solution(numbers, hand);

        System.out.println(result);
    }

    private static String solution(int[] numbers, String hand) {
        String answer = "";
        Key[] keypad = new Key[10];
        Key left = new Key(10, 3, 0);
        Key right = new Key(11, 3, 2);
        int x = 0;
        int y = 0;
        for (int i = 0; i < keypad.length; i++) {
            if (i == 0) {
                keypad[i] = new Key(0, 3, 1);
            }
            else {
                keypad[i] = new Key(i, x, y);
                y++;
            }
            if (y > 2) {
                x++;
                y = 0;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left = keypad[numbers[i]];
            }
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right = keypad[numbers[i]];
            }
            else {
                int leftDistance = Math.abs(keypad[numbers[i]].x - left.x) + Math.abs(keypad[numbers[i]].y - left.y);
                int rightDistance = Math.abs(keypad[numbers[i]].x - right.x) + Math.abs(keypad[numbers[i]].y - right.y);
                if (leftDistance > rightDistance) {
                    answer += "R";
                    right = keypad[numbers[i]];
                }
                else if(rightDistance > leftDistance) {
                    answer += "L";
                    left = keypad[numbers[i]];
                }
                else {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = keypad[numbers[i]];
                    }
                    else {
                        answer += "L";
                        left = keypad[numbers[i]];
                    }
                }
            }
        }
        return answer;
    }

    public static class Key {
        int num;
        int x;
        int y;
        public Key(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }
}
