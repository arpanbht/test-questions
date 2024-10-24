/*
 * you are required to reverse the sentance given from stdin
 * eg -> hello world , then output is: world hello
 */

import java.util.Scanner;

public class ReverseSentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[arr.length - i - 1]);
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.length());

        sc.close();
    }
}