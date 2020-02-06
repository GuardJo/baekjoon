package baekjoon;

public class p15596 {
    public static void main(String[] args) {

        /**
         * example data
         */
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = i+1;
        }
        System.out.println(sum(list));
    }

    /**
     * Calculate to all of elements of array
     * @param
     * @return sum
     */
    public static long sum(int[] a) {
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
