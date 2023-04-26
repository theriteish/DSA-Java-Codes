import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //SubArray Algorithm: O(n*n)
//        int [] arr = {1,5,6,4,7,9};
//        int s =0, e =0 , m =0;
//        int count =0;
//        for(s =0; s<arr.length; s++){
//            for(e = s; e<arr.length; e++){
//                for(m =s ; m<=e; m++){
//                    System.out.print(arr[m]+" ");
//                }
//                System.out.println();
//            }
//        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int count =0;
            Arrays.sort(arr);

            for(int i =0; i<n; i++){
                int l =i+1 , r = n-1;
                if(arr[i] + arr[l] + arr[r] == x){
                    count ++;
                }
                while(l<r){
                    if(arr[i] + arr[l] + arr[r] == x)
                        count++;
                    else if(arr[i] + arr[l] + arr[r] > x){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}