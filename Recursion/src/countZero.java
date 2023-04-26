public class countZero {
    public static void main(String[] args) {
        int n = 9070080;
        int ans = countZero(n);
        System.out.println(ans);
    }
    static int countZero(int n){
        int count =0;
        return helper(n , count);
    }

    private static int helper(int n, int count) {
        if(n==0)return count;
        int rem = n%10;
        if(rem == 0){
          return  helper(n/10 , count+1);
        }
        return helper(n/10 , count);
    }
}
