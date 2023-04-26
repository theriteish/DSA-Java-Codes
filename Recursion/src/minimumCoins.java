import java.util.Scanner;

public class minimumCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int m = coins.length;
        int V = sc.nextInt();
        System.out.println(minCoins(coins , m , V));

    }
    static int minCoins(int coins[], int m, int v) {
        //Write your code here
        int count = 0;
        if(m==0){
            return 0;
        }
        if(coins[m-1]<=v){
            v = v - coins[m-1];
            count =1;
        }
        return count + minCoins(coins , m-1 , v);
    }
}
