public class SelectionSort {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = { 5, 4, 2, 3, 9, 1, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i + 1];
            int minIndex = i + 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (arr[i] > min) {
                count += 1;
                int t = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = t;
            }

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n" + count);
    }
}
