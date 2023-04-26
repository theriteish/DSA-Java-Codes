public class EvenFibonacci {

    static int evenFibo(int n){

        if(n==0) return 0;
        if(n==1) return 2;

        int mod = (int)1e9 + 7;
        int ans = 4*evenFibo(n-1) + evenFibo(n-2);
        return ans%mod;
    }

    public static void main(String[] args) {
        int ans = evenFibo(4);
        System.out.println(ans);
    }
}
