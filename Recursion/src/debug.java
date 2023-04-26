import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        System.out.println(isnonPrime(1));
        System.out.println(isPrime(15));
    }
    static boolean isNonPrime(int n){
        int count =0;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0)count ++;
        }
        if(count>0) return true;
        return false;
    }
    static boolean isnonPrime(int n){
        if(n==1)return true;
        int ct =0;
        for(int i =2 ; i*i<=n ; i++){
            if(n%i==0)
                ct++;
        }
        if(ct>=1){
            return true;
        }
        return false;
    }
    static boolean isPrime(int n){
        if(n<2)return false;
        int count =0;
        for(int i =2; i*i<=n; i++){
            if(n%i==0)count ++;
        }
        if(count >0)return false;
        return true;
    }
}
