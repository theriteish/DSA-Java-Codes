import java.util.Scanner;

public class geekoNacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int n =sc.nextInt();
        int ans = geekoNacci(a , b , c , n);
        System.out.println(ans);
    }
    static int geekoNacci(int a , int b ,int c , int n){
        if(n==1)return a;
        if(n==2)return b;
        if(n==3)return c;
        return geekoNacci(a,b,c,n-1)+ geekoNacci(a,b,c,n-2)+ geekoNacci(a,b,c,n-3);
    }
}
