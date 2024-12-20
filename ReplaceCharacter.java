/*
 * You are given a function,

Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
paales
Explanation:

‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.
 */

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "enthusiast";
        char ch1 = 't';
        char ch2 = 's';

        String res = replaceChars(str, ch1,ch2);
        System.out.print(res);
    }
    static String replaceChars(String str, char ch1, char ch2){
        if(str == null) return "";
        String res = "";

        for(char c: str.toCharArray()){
            if(c == ch1) res = res + ch2;
            else if(c == ch2) res = res + ch1;
            else res = res + c;
        }

        return res;
    }
}
