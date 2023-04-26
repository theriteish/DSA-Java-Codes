import java.util.Arrays;
import java.util.Scanner;

public class SmallestGreaterMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }

    }
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here
        int [] newArray = new int [arr.length];
        for(int i =0; i<arr.length; i++){
            int k = arr[i];
            int ans = Integer.MAX_VALUE;
            boolean flag = false;
            for(int j =0; j<arr.length; j++){
                if(arr[j]>k) {
                    ans = Math.min(ans, arr[j]);
                    flag = true;
                }
            }
            if(flag == false) {
                ans = -10000000;
            }
            newArray[i] = ans;
        }
        return newArray;
    }
    static int justMaximum(int [] arr , int curElement){
        int [] temp = new int [arr.length];
        int id = 0;
        for(int i =0; i< arr.length; i++){
            temp[id] = arr[i];
            id++;
        }
        Arrays.sort(temp);
        for(int i =0; i<id; i++){
            if(temp[i]>curElement){
                return temp[i];
            }
        }
        return -10000000;
    }
}
