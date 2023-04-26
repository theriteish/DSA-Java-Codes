public class fourFibonacci {
    static int fourFibonacci(int n){
        if(n==1)return 1;
        if(n==2)return 1;
        if(n==3)return 1;
        if(n==4)return 1;

        return fourFibonacci(n-1)+ fourFibonacci(n-2)+fourFibonacci(n-3)+fourFibonacci(n-4);
    }

    public static void main(String[] args) {
        int ans = fourFibonacci(10);
        System.out.println(ans);
    }
}
