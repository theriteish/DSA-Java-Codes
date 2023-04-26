public class revreseNum {
    public static void main(String[] args) {
        int n = 1;
        int ans = reverse2(n);
        System.out.println(ans);
        System.out.println(isPalindrome(n));
    }
    static int sum =0;
    static void reverse(int n){
        if(n==0) return ;
        int digit = n%10;
        sum = sum*10 + digit;
        reverse(n/10);
    }
    static int reverse2(int n){
        int digits = (int)Math.log10(n)+1;
        int ans = helper(n, digits);
        return ans;
    }
    static boolean isPalindrome(int n){
        return n == reverse2(n);
    }

    private static int helper(int n, int digits) {
        if(n==0)return 0;
        int base = (int)Math.pow(10, digits-1);
        int rem = n%10;
        return rem * base + helper(n/10 , digits-1);
    }
}
