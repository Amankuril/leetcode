
import java.util.*;

public class leetcode_128 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 1, 3, 4, 6, 7 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
