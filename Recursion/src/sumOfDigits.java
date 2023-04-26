public class sumOfDigits {
    public static void main(String[] args) {
        int n = 764533;
        int ans = sumDigits(n);
        System.out.println(ans);
    }
    static int sumDigits(int n){
        if(n==0)return 0;
        return n%10 + sumDigits(n/10);
    }
}
