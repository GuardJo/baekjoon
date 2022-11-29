package kakaomobility2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3 {
    public int solution(int N, String S) {
        int result = 0;

        if (S.isEmpty() || S.equals(" ")) {
            return N * 2;
        }

        String[] arr = S.split(" ");

        List<List<String>> seatsList = generateSeats(arr, N);

        for (int i = 0; i < seatsList.size(); i++) {
            List<String> seats = seatsList.get(i);

            if (seats.size() == 0) {
                result += 2;
            }
            else {
                result += countPossibleSeats(seats);
            }
        }

        return result;
    }

    private int countPossibleSeats(List<String> seats) {
        int result = 0;
        String[][] possible4SeatsSide = {
                {"B", "C", "D", "E"},
                {"F", "G", "H", "J"}
        };
        String[] possible4SeatsCenter = {"D", "E", "F", "G"};

        long possibleCount = Arrays.stream(possible4SeatsSide)
                .filter((side) -> {
                    for (String seat : seats) {
                        if (Arrays.asList(side).contains(seat)) {
                            return false;
                        }
                    }
                    return true;
                })
                .count();

        if (possibleCount == 0) {
            for (String seat : seats) {
                if (!Arrays.asList(possible4SeatsCenter).contains(seat)) {
                    possibleCount++;
                    break;
                }
            }
        }

        result += possibleCount;

        return result;
    }

    private List<List<String>> generateSeats(String[] arr, int n) {
        List<List<String>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        Arrays.stream(arr).forEach((str) -> {
            char[] chars = str.toCharArray();
            String rows = "";
            String value = "";

            for (char c : chars) {
                if (Character.isDigit(c)) {
                    rows += c;
                }
                else {
                    value += c;
                }
            }

            list.get(Integer.parseInt(rows) - 1).add(value);
        });

        return list;
    }

    public static void main(String[] args) {
        int n = 22;
        String s = "1A 3C 2B 20G 5A";

        int result = new P3().solution(n, s);

        System.out.println(result);
    }
}
