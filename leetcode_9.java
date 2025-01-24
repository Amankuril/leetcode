public class leetcode_9 {
    public static void main(String args[]){
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}