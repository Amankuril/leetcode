
import java.util.Arrays;

public class leetcode_567 {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int n = s2.length();

        if (k > n) {
            return false;
        }

        char[] s1Chars = s1.toCharArray();
        Arrays.sort(s1Chars);
        String sortedS1 = new String(s1Chars);

        for (int i = 0; i <= n - k; i++) {
            String substring = s2.substring(i, i + k);
            char[] substringChars = substring.toCharArray();
            Arrays.sort(substringChars);
            String sortedSubstring = new String(substringChars);
            if (sortedS1.equals(sortedSubstring)) {
                return true;
            }
        }
        return false;
    }
}
