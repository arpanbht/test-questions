// import java.util.Scanner;

// This is the code for pivot at the beginning of the array
// public class QuickSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the array size: ");
//         int n = sc.nextInt();
//         int[] a = new int[n];

//         System.out.println("Enter the array elements: ");
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         System.out.println("Unsorted Array: ");
//         for (int i : a) {
//             System.out.print(i + " ");
//         }

//         quickSort(a, 0, n - 1);

//         System.out.println("\nSorted Array: ");
//         for (int i : a) {
//             System.out.print(i + " ");
//         }
//         sc.close();
//     }

//     public static void quickSort(int[] a, int lb, int ub) {
//         if (lb < ub) {
//             int loc = partition(a, lb, ub);
//             quickSort(a, lb, loc - 1);
//             quickSort(a, loc + 1, ub);
//         }
//     }

//     public static int partition(int[] a, int lb, int ub) {
//         int pivot = a[lb];
//         int start = lb;
//         int end = ub;

//         while (start < end) {
//             while (start < end && a[start] >= pivot) {
//                 start++;
//             }
//             while (a[end] < pivot) {
//                 end--;
//             }
//             if (start < end) {
//                 swap(a, start, end);
//             }
//         }
//         swap(a, lb, end);
//         return end;
//     }

//     public static void swap(int[] a, int i, int j) {
//         int temp = a[i];
//         a[i] = a[j];
//         a[j] = temp;
//     }
// }

// Code for the algorithm where pivot is at the end of the array

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 8, 2, 13, 45, 67, 9, 21 };

        quickSort(a, 0, a.length - 1);

        System.out.println("Sorted Array: ");
        for (int i : a) {
            System.out.print(i + " | ");
        }
    }

    public static void quickSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc - 1);
            quickSort(a, loc + 1, ub);
        }
    }

    public static int partition(int[] a, int lb, int ub) {
        int pivot = a[ub]; // Pivot is the last element
        int i = lb - 1; // Index of the smaller element

        for (int j = lb; j < ub; j++) {
            if (a[j] <= pivot) { // If current element is <= pivot
                i++;
                swap(a, i, j);
            }
        }
        // Place the pivot in its correct position
        i++;
        swap(a, i, ub);
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
