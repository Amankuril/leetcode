
public class leetcode_50 {

    public static void main(String[] args) {
        double x = -3.00000;
        int n = -5;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {

        // double tempX = x;
        // if (n < 0 && x < 0) {
        //     while (n < 1) {
        //         x /= tempX;
        //         n++;
        //     }
        // } else if (n > 0 || x < 0) {
        //     while (n > 1) {
        //         x *= tempX;
        //         n--;
        //     }
        // } else {
        //     while (n < 1) {
        //         x /= tempX;
        //         n++;
        //     }
        // }
        // return x;
        return Math.pow(x, n);
    }
}
