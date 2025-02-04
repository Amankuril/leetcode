

public class leetcode_1800 {

    public static void main(String args[]) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(nums));
    }

    public static int maxAscendingSum(int[] nums) {
        int ans = 0;
        int max = 0;

        max += nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                max += nums[i + 1];
            } else {
                ans = Math.max(ans, max);
                max = nums[i + 1];
            }

        }

        return Math.max(ans, max);
    }
}
