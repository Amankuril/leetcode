
public class leetcode_3107 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(longestMonotonicSubarray(nums));
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int increasing = 1;
        int decreasing = 1;

        int ans = 1;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]) {
                increasing++;
                decreasing = 1;
                ans = Math.max(ans, increasing);
            } else if(nums[i] > nums[i + 1]) {
                decreasing++;
                increasing = 1;
                ans = Math.max(ans, decreasing);
            } else {
                increasing = 1;
                decreasing = 1;
            }

            ans = Math.max(ans, Math.max(increasing, decreasing));
        }
        return ans;
    }
}
