import java.util.Scanner;

public class SubArray1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int n =3, s =6;
        solve(arr, n, s);
    }
    public static void solve(int []arr, int n, int k){
        int s =0, e =0, m =0;
        for(s =0; s<n; s++){
            for(e =0; e<n; e++){
                int size = (e-s+1);
                int sum =0;
                for(m=s ; m<=e; m++){
                    sum += arr[m];
                }
                if(n==size){
                    if(k == sum)
                        System.out.print("YES");
                    return;
                }
            }
        }
        System.out.print("NO");
    }
}
