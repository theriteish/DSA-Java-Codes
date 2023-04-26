public class powerOfDigit {
    public static void main(String[] args) {
        int n =2;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if(n==0)return false;
        while(n!=2){
            if(n%2!=0)return false;
            n/=2;
        }
        return true;
    }
}
