package NHN_PreTest1;

import java.io.*;

public class p1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numOfAllPlayers = Integer.parseInt(br.readLine());
        int numOfQuickPlayers = Integer.parseInt(br.readLine());
        char[] namesOfQuickPlayers = new char[numOfQuickPlayers];
        String[] tmp = br.readLine().split(" ");
        for (int i = 0; i < tmp.length; i++) {
            namesOfQuickPlayers[i] = tmp[i].toCharArray()[0];
        }
        int numOfGames = Integer.parseInt(br.readLine());
        int[] numOfMovesPerGames = new int[numOfGames];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            numOfMovesPerGames[i] = Integer.parseInt(str[i]);
        }

        solution(numOfAllPlayers, numOfQuickPlayers, namesOfQuickPlayers, numOfGames, numOfMovesPerGames);
        br.close();
        bw.flush();
        bw.close();
    }

    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame) {
        int[] players = new int[numOfAllPlayers - 1];
        int[] playerCount = new int[numOfAllPlayers];
        playerCount[0]++;
        int playerIndex = 0;
        int playerNumber = 0;

        for (int i = 0; i < players.length; i++) {
            players[i] = i + 1;
        }

        for (int i = 0; i < numOfMovesPerGame.length; i++) {
            playerIndex = playerIndex + numOfMovesPerGame[i];
            if (playerIndex >= 0) {
                playerIndex = playerIndex % players.length;
            }
            else if (playerIndex < 0) {
                playerIndex = players.length - (Math.abs(playerIndex) % players.length);
            }
            boolean change = true;
            for (int j = 0; j < namesOfQuickPlayers.length; j++) {
                if (players[playerIndex] == namesOfQuickPlayers[j] - 65) {
                    playerCount[playerNumber]++;
                    change = false;
                }
            }
            if (change) {
                int tmp = playerNumber;
                playerNumber = players[playerIndex];
                players[playerIndex] = tmp;
                playerCount[playerNumber]++;
            }
        }

        for (int i = 0; i < players.length; i++) {
            char alphabet = (char) (players[i] + 65);
            System.out.println(alphabet + " " + playerCount[players[i]]);
        }
        System.out.println(((char)(playerNumber + 65)) + " " + playerCount[playerNumber]);
    }
}
