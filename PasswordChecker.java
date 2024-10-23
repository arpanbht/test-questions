
/*
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters #
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number #
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67

Output 1:
1

Input 2:
a987 abC012

Output 2:
0
*/
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int isCorrect = CheckPassword(str, str.length());

        System.out.println(isCorrect);
        sc.close();
    }

    static int CheckPassword(String str, int n) {
        if (n <= 4)
            return 0;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            return 0;
        int number=0, capital=0, flag=0;
        for (int i = 0; i < n; i++) {
            char c=str.charAt(i);
            if(c>=65 && c<=90) {
                capital++;
            }
            else if(c>='0' && c<='9') {
                number++;
            }
            else if(c==' ' || c=='/') {
                flag=1;
                break;
            }
        }
        if(number>0 && capital>0 && flag==0) {
            return 1;
        }
        return 0;
    }
}
