/*
The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:
All array elements are unique
Treat the 0th position as eve

Return 0 if array is empty
Return 0, if array length is 3 or less than 3

Example

Input

arr:3 2 1 7 5 4

Output

7
*/

import java.util.ArrayList;
import java.util.Collections;

public class EvenAndOddELementDifference {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 7, 5, 4 };

        int diff = calculateNumberSum(arr);

        System.out.println(diff);
    }

    static int calculateNumberSum(int[] arr) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        return Math.abs(even.get(1) + odd.get(odd.size() - 2));
    }
}
