import java.util.Arrays;
public class leetcode_1464{
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};

        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length-1];
        int j = nums[nums.length-2];

        return ((i-1)*(j-1));
    }
}