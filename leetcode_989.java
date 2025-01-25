
import java.util.ArrayList;

public class leetcode_989 {

    public static void main(String[] args) {
        int[] arr = new int[0];
        int k = 23;

        System.out.println(addToArrayForm(arr, k));
    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;

        int p = num.length - 1;

        while (p >= 0 || k > 0) {

            int val = 0;

            if (p >= 0) {
                val = num[p];
            }

            int d = k % 10;

            int sum = val + d + carry;

            int digit = sum % 10;
            carry = sum / 10;

            list.add( 0, digit);

            p--;
            k /= 10;
        }
        if (carry > 0) {
            list.add(0, carry);
        }
        return list;
    }
}
