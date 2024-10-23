public class FlipSwitch {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1 };
        int len = arr.length;

        int flips = countFlips(arr, len);

        System.out.println(flips);
    }

    static int countFlips(int[] arr, int len) {
        int flips = 0;
        for (int i = 0; i < len; i++) {
            if (flips % 2 == 0 && arr[i] == 0) {
                flips++;
            } else if (flips % 2 == 1 && arr[i] == 1) {
                flips++;
            }
        }

        return flips;
    }
}
