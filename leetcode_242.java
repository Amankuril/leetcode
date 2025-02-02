
import java.util.HashSet;

public class leetcode_242 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        String ans = "";
        String check = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    ans += t.charAt(j);
                }
            }
        }

        String a1 = remDuplicate(s);
        String a2 = remDuplicate(ans);
        if (a1.equals(a2)) {
            return true;
        }
        return false;
    }

    public static String remDuplicate(String str) {

        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        str = "";
        for (char c : set) {
            str += c;
        }

        return str;
    }
}
