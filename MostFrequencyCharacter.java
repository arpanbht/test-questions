import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequencyCharacter {
    public static void main(String[] args) {
        String str = "bbadbbababb";
        char x = 't';
        int[] freq = new int[26];

        for (char i : str.toCharArray()) {
            freq[i-'a']++;
        }

        char maxx=' ';
        int Fmaxx_index=-1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                // maxx=
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
