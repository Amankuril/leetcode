
public class leetcode_11 {

    public static void main(String[] args) {
        int[] height = { 8, 7, 2, 1, 9 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int ans = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(ans, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
