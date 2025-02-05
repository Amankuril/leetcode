
public class leetcode_1790 {

    public static void main(String args[]) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int count = 0;
        StringBuilder sb1 = new StringBuilder(); // for this case "kb"
        StringBuilder sb2 = new StringBuilder(); // for this case "bk"

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
            }
        }

        if (count == 2) {
            return sb1.toString().equals(sb2.reverse().toString()); //check the "kb" with  reverse "bk"
        }

        return false;
    }
}
