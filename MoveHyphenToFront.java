/*
 * char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
 */

public class MoveHyphenToFront {
    public static void main(String[] args) {
        String str = "Move-Hyphens-to-Front";

        String res = moveHyphen(str);
        System.out.println(res);
    }

    static String moveHyphen(String str) {
        if (str == null)
            return null;
        String res = "";

        for (char c : str.toCharArray()) {
            if (c == '-')
                res = c + res;
            else
                res = res + c;
        }
        return res;
    }
}
