public class fibonacci {

    static int fibo(int n){
       //base case:-
        if(n == 0)return 0;
        if(n == 1)return 1;

        int first = fibo(n-1);
        int second = fibo(n-2);
        int ans = first + second;
        return ans;
    }

    public static void main(String[] args) {
        int ans = fibo(9);
        System.out.println(ans);
    }
}
