public class leetcode_1518{
    public static void main(String args[]){
        int a = 15;
        int b = 4;

        System.out.println(numWaterBottles(a, b));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
     int ans = numBottles;

        while(numBottles >= 0){
           if(count == numExchange){
             ans ++;
             numBottles ++;
             count = 0;
           }
            count++;
            numBottles --;
        }   

        return ans;

    }
}