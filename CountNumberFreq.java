public class CountNumberFreq {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 3, 5, 1, 5, 5, 1, 3, 3 };
        int[] freq = new int[10];

        for (int i : arr) {
            freq[i]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Number: " + i + " " + "frequency: " + freq[i]);
            }
        }

        int res = freq[0], res_index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > res) {
                res = freq[i];
                res_index = i;
            }
        }
        System.out.printf("%d has max frequency of %d", res_index, res);
    }
}
