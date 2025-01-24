public class leetcode_509{
    public static void main(String args[]){
        int n = 5;

        System.out.println(fib(n));
    }
    public static int fib(int n) {
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        return a;
    }
}