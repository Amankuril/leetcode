
import java.util.Arrays;

public class leetcode_268 {

    public static void main(String args[]) {
        int[] arr = {9, 6, 7, 5, 0, 1, 2, 3, 8};

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                ans = nums[i] + 1;
            }
        }
        if (nums[0] > 0) {
            return 0;
        }
        if (ans == 0) {
            return nums[nums.length - 1] + 1;
        }

        return ans;
    }
}
