
public class leetcode_334 {

    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 4, 1, 3};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (first >= nums[i]) {
                first = nums[i];
            } else if (second >= nums[i]) {
                second = nums[i];
            } else if (third >= nums[i]) {
                third = nums[i];
                return true;
            }
        }
        return false;
    }
}
