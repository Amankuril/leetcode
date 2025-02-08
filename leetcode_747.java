
import java.util.Arrays;

public class leetcode_747 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int largest = nums[0];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                idx = i;
            }
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] * 2 > largest) {
                idx = -1;
            }
        }

        return idx;
    }
}
