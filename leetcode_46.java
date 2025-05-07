import java.util.ArrayList;
import java.util.List;

public class leetcode_46 {

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

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();

        helper(nums, arr, new ArrayList<Integer>(), new boolean[nums.length]);

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(permute(nums));
    }
}