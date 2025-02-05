

public class leetcode_167 {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(numbers, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {

        //  O(n) squere
        // ArrayList<Integer> list = new ArrayList<>();

        // int count = 0;
        // while (count < numbers.length) {
        //     for (int i = count+1; i < numbers.length; i++) {
        //         if (numbers[count] + numbers[i] == target) {
        //             list.add(count + 1);
        //             list.add(i + 1);
        //             break;
        //         }
        //     }
        //     if (!list.isEmpty()) {
        //         break;
        //     }
        //     count++;
        // }

        // int[] ans = new int[list.size()];
        // for (int i = 0; i < ans.length; i++) {
        //     ans[i] = list.get(i);
        // }

        // return ans;

        

        // O(n) time complexity
        int left = 0;
        int right = numbers.length - 1; 
        
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[] {left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {0, 0};
    }
}
