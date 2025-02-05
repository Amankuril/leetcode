
import java.util.ArrayList;

public class leetcode_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (list.contains(sum)) {
                return false;
            }
            list.add(sum);
            n = sum;
        }
        return true;
    }
}
