class leetcode_231 {
    public static void main(String args[]){
        int n = 16;

        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            return true;
        }else {
            return false;
        }
    }
}