
public class leetcode_42 {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {

        if (height == null || height.length < 3) {
            return 0; // agar array khali ha ya usme 2 ya 2 se kam elements hai to 0 return kar do
        }

        int n = height.length;

        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]); // har ek element ke liye usse left ki max height ek array me store kar rahe hai
        }

        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);// har ek element ke liye usse right ki max height ek array me store kar rahe hai
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(maxLeft[i], maxRight[i]) - height[i]; // har ek element ke liye usse left aur right me se minimum height nikal kar khud ki height se minus kar rahe hai, or usko totalWater me add kar rahe hai
        }

        return totalWater;
    }
}
