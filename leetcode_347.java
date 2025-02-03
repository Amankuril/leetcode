
import java.util.HashMap;

public class leetcode_347 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] ans = new int[k];

        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        while (k > 0) {
            int max = 0;
            int maxKey = 0;
            for (int key : freq.keySet()) {
                if (freq.get(key) > max) {
                    max = freq.get(key);
                    maxKey = key;
                }
            }

            ans[k - 1] = maxKey;
            freq.remove(maxKey);
            k--;
        }

        return ans;
    }
}
