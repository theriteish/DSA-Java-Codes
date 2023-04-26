public class subSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int total = (int)Math.pow(2 , arr.length);
        for(int i =0; i<total; i++){
            int bi = binary(i);
            printss(arr , bi);
        }
    }
    static void printss(int [] arr, int bi){
        for(int i = 0; i<arr.length; i++){
            int rem = bi%10;
            if(rem == 1){
                System.out.print(arr[i]+" ");
            }
            bi = bi/10;
        }
        System.out.println();
    }
    static int binary(int n){
        if(n==0)return 0;
        String ans = "";
        while(n!=0){
            int digit = n%2;
            ans = digit+ans;
            n/=2;
        }
        return Integer.parseInt(ans);
    }
}

