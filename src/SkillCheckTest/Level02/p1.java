package SkillCheckTest.Level02;

public class p1 {
    public static void main(String[] args) {
        String m = "ABC";
        String[] musicinfos = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
        String result = solution(m, musicinfos);

        System.out.println(result);
    }

    private static String solution(String m, String[] musicinfos) {
        String answer = "";
        boolean[] isCorrect = new boolean[musicinfos.length];
        int[] correctTime = new int[musicinfos.length];
        int maxTime = 0;
        String[] shap = {"C#", "D#", "F#", "G#", "A#"};
        String[] changeShap = {"H", "I", "J", "K", "L"};
        for (int i = 0; i < musicinfos.length; i++) {
            for (int j = 0; j < shap.length; j++) {
                m = m.replaceAll(shap[j], changeShap[j]);
                musicinfos[i] = musicinfos[i].replaceAll(shap[j], changeShap[j]);
            }
            if (correctMusic(m, musicinfos[i], correctTime, i)) {
                isCorrect[i] = true;
            }
        }

        for (int i = 0; i < isCorrect.length; i++) {
            if (isCorrect[i]) {
                if (maxTime < correctTime[i]) {
                    answer = musicinfos[i].split(",")[2];
                    maxTime = correctTime[i];
                }
            }
        }

        if (answer.equals("")) {
            answer = "(None)";
        }


        return answer;
    }

    private static boolean correctMusic(String m, String musicinfo, int[] time, int num) {
        String[] str = musicinfo.split(",");
        int startTime = (Integer.parseInt(str[0].split(":")[0]) * 60) + Integer.parseInt(str[0].split(":")[1]);
        int endTime = (Integer.parseInt(str[1].split(":")[0]) * 60) + Integer.parseInt(str[1].split(":")[1]);
        String[] music = str[3].split("");
        int timeLength = endTime - startTime;
        time[num] = timeLength;
        int musicLength = music.length;

        if (musicLength > timeLength) {
            str[3] = str[3].substring(0, timeLength-1);
        }

        int index = 0;
        while (musicLength < timeLength) {
            str[3] += music[index];
            musicLength++;
            index++;

            if (index > music.length-1) {
                index = 0;
            }
        }

        return str[3].contains(m);
    }
}
