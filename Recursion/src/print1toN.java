import java.util.Scanner;

public class print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversePrint(n);
        printN(n);
    }
    static void printN(int n){
        if(n==0)return;
        printN(n-1);
        System.out.print(n+" ");
    }
    static void reversePrint(int n){
        if(n==0)return;
        System.out.print(n+" ");
        reversePrint(n-1);
    }
}
