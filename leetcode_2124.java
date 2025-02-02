
public class leetcode_2124 {

    public static void main(String args[]) {
        String s = "aaabbb";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        char key = 'a';

        for (int i = 0; i < s.length(); i++) {
            if (key == 'a' && s.charAt(i) == 'b') {
                key = 'b';
                continue;
            }
            if (key == 'b' && s.charAt(i) == 'a') {
                return false;
            }
        }
        return true;
    }
}
