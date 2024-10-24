public class validAnagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        int flag = 0;

        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                flag = 1;
                System.out.println("no");
                break;
            }
        }
        if (flag == 0)
            System.out.println("yes");
    }
}
