public class OptimizedPower {
    public static void main(String[] args) {
        int ans = optimizedPower(2,3);
        System.out.println(ans);
    }
    static int optimizedPower(int x , int n){
        if(n==0)return 1;
        int ans = optimizedPower(x,n/2);
        if(n%2==0){
            return ans*ans;
        }else{
            return ans*ans*x;
        }
    }
}
