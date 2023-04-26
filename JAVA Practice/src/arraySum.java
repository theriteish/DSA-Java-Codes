import java.util.Arrays;

public class arraySum {
    public static void main(String[] args) {
        int []a = {9,9,9};
        int []b = {2,8};
        System.out.println(Arrays.toString(calSum(a,b,a.length, b.length)));
    }
    static int[] calSum(int a[], int b[], int n, int m) {
        // your code here
        int sum [] = new int[n>m?n:m];
        int carry = 0;
        int i = a.length-1;
        int j = b.length-1;
        int k = sum.length-1;
        while(k>=0){
            int digit = carry;
            if(i>=0){
                digit += a[i];
            }
            if(j>=0){
                digit += b[j];
            }
            carry = digit/10;
            digit = digit%10;

            sum[k] = digit;
            i--;
            j--;
            k--;
        }
        if(carry == 0){
            return sum;
        }
        int [] netSum = new int [sum.length+1];
        netSum[0] = carry;
        for(int idx=0; idx<sum.length; idx++){
            netSum[idx+1] = sum[idx];
        }
        return netSum;
    }
}
