public class leetcode_1752{
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(checkArray(nums));
    }

    public static boolean checkArray(int[] nums){
        int count = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) 
                count++;
            if (count > 1) 
                return false;
        }
        
        return true;
    }
}