import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode_47 {
    public static void helper(int[] nums, List<List<Integer>> arr, List<Integer> ans, boolean[] visited) {

        if (ans.size() == nums.length) {
            arr.add(new ArrayList<Integer>(ans));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == true) {
                continue;
            }
            visited[i] = true;
            ans.add(nums[i]);
            helper(nums, arr, ans, visited);
            ans.remove(ans.size() - 1);
            visited[i] = false;
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> arr = new ArrayList<>();

        helper(nums, arr, new ArrayList<Integer>(), new boolean[nums.length]);

        Set<List<Integer>> set = new HashSet<>(arr);


        return new ArrayList<List<Integer>>(set);
    }
    public static void main(String[] args) {
        int [] nums = { 1, 1, 2 };
        System.out.println(permuteUnique(nums));
    }
}
