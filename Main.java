// public class Main {
//     public static void main(String[] args) {
//         String encodedString = "796115110113721110141108"; // Sample input
//         System.out.println(decodePassword(encodedString));
//     }

//     public static String decodePassword(String s) {
//         StringBuilder result = new StringBuilder();
//         StringBuilder reversed = new StringBuilder(s).reverse(); // Step 1: Reverse the string

//         for (int i = 0; i < reversed.length();) {
//             int asciiValue;

//             // Step 2: Try picking three digits
//             if (i + 2 < reversed.length()) {
//                 asciiValue = Integer.parseInt(reversed.substring(i, i + 3));
//                 if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)
//                         || asciiValue == 32) {
//                     result.append((char) asciiValue);
//                     i += 3; // Move by three digits if a valid character is found
//                     continue;
//                 }
//             }

//             // Step 3: Otherwise, pick two digits
//             asciiValue = Integer.parseInt(reversed.substring(i, i + 2));
//             if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122) || asciiValue == 32) {
//                 result.append((char) asciiValue);
//                 i += 2; // Move by two digits if a valid character is found
//             }
//         }

//         return result.toString(); // Reverse to get the original password
//     }
// }

public class Main {
    public static void main(String[] args) {
        String encodedString = "670219986"; // Sample input
        System.out.println(decodePassword(encodedString));
    }

    public static String decodePassword(String s) {
        StringBuilder result = new StringBuilder();

        // Reverse the input string
        s = new StringBuilder(s).reverse().toString();

        int i = 0;
        while (i < s.length()) {
            int asciiValue;

            // Try to parse a three-digit ASCII value
            if (i + 2 < s.length()) {
                asciiValue = Integer.parseInt(s.substring(i, i + 3));
                if (isValidAscii(asciiValue)) {
                    result.append((char) asciiValue);
                    i += 3;
                    continue;
                }
            }

            // Try to parse a two-digit ASCII value
            asciiValue = Integer.parseInt(s.substring(i, i + 2));
            if (isValidAscii(asciiValue)) {
                result.append((char) asciiValue);
                i += 2;
            }
        }

        return result.toString();
    }

    private static boolean isValidAscii(int asciiValue) {
        return (asciiValue >= 65 && asciiValue <= 90) || // A-Z
                (asciiValue >= 97 && asciiValue <= 122) || // a-z
                asciiValue == 32; // Space
    }
}
