package dec_08_2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DiskData {
    public static void main(String[] args) {
        int[][] records = {{1, 1, 5}, {2, 4, 7}, {1, 5, 10}, {3, 1, 10}, {2, 1, 5}, {1, 3, 3}, {3, 2, 8}, {2, 2, 8},
                {3, 4, 7}};
        int n = 3;
        int m = 5;

        DiskData diskData = new DiskData();

        int[][] results = diskData.solution(n, m, records);

        for (int[] result : results) {
            for (int r : result) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }

    public int[][] solution(int n, int m, int[][] records) {
        int[][] answer = {};
        List<Data> removedData = new ArrayList<>();

        Disk[] disks = new Disk[n];
        int[] dataNumbers = new int[m];

        for (int i = 0; i < disks.length; i++) {
            Disk disk = new Disk();
            disk.setNumber(i + 1);
            disks[i] = disk;
        }

        List<Data> dataList = new ArrayList<>();

        for (int i = 0; i < records.length; i++) {
            int[] record = records[i];
            int diskNumber = record[0];
            int dataNumber = record[1];
            int refTime = record[2];

            Disk disk = disks[diskNumber - 1];
            Data data = new Data();
            data.setDisk(disk);
            disk.setCount(disk.getCount() + 1);

            data.setNumber(dataNumber);
            data.setTime(refTime);
            data.setIndex(i);

            dataList.add(data);
            ++dataNumbers[dataNumber - 1];
        }

        while (true) {
            List<Data> duplicateList = dataList.stream()
                    .filter(data -> {
                        int duplicateCount = dataNumbers[data.getNumber() - 1];

                        return duplicateCount > 1;
                    })
                    .sorted(Comparator.comparing(Data::getTime).reversed())
                    .collect(Collectors.toList());

            if (duplicateList.isEmpty()) {
                break;
            }

            int oldestTime = duplicateList.get(0).getTime();

            List<Data> sameTimeList = duplicateList.stream()
                    .filter(data -> data.getTime() == oldestTime)
                    .collect(Collectors.toList());
            if (sameTimeList.size() == 1) {
                Data data = sameTimeList.get(0);
                Disk disk = data.getDisk();
                disk.setCount(disk.getCount() - 1);
                --dataNumbers[data.getNumber() - 1];
                dataList.remove(data);
                removedData.add(data);
                continue;
            }

            List<Data> biggerDiskDataList = sameTimeList.stream()
                    .sorted(Comparator.comparing(Data::getDiskCount).reversed()
                            .thenComparing(Data::getIndex))
                    .collect(Collectors.toList());

            if (!biggerDiskDataList.isEmpty()) {
                Data data = biggerDiskDataList.get(0);
                Disk disk = data.getDisk();
                disk.setCount(disk.getCount() - 1);
                --dataNumbers[data.getNumber() - 1];
                dataList.remove(data);
                removedData.add(data);
            }
        }

        answer = new int[removedData.size()][2];

        for (int i = 0; i < answer.length; i++) {
            Data remove = removedData.get(i);
            answer[i][0] = remove.getDisk().getNumber();
            answer[i][1] = remove.getNumber();
        }


        return answer;
    }

    class Disk {
        int count;
        int number;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

    class Data {
        int number;
        int time;
        Disk disk;
        int index;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public Disk getDisk() {
            return disk;
        }

        public void setDisk(Disk disk) {
            this.disk = disk;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getDiskCount() {
            return this.disk.getCount();
        }
    }
}
