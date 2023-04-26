import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
//        int sum =0 ;
//        while(n>0){
//            int digit = n%10;
//           if(digit%2==0) {
//               sum += digit;
//           }
//            n /=10;
//        }
//        System.out.println( sum );


       // System.out.println(sum);
      int [][] arr = new int [n][n];
        for(int i =0 ;i<n; i++){
           for(int j =0; j<n;j++){
               arr[i][j] = sc.nextInt();
           }
        }
       int [] ans = diff(arr);
        for(int i =0;i<n;i++){
            System.out.print(ans[i]+" ");
        }





    }


    static int []  diff(  int [][]mat){
        int n = mat.length;
        int [] ans = new int [n];
        int count =0;


        for(int i =0; i<n; i++){
            int dif =0;
            int rowSum= 0;
            int colSum=0;
            for(int j =0 ; j<n; j++){
                rowSum += mat[i][j];
                colSum += mat[j][i];

            }
            dif = colSum-rowSum;
            ans[count] = dif;
            count++;
        }
        return ans;
    }
    static int visivblwBoxes(int []arr){
        int count = 0;
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length-1; i++){
            if(arr[i+1]==2*arr[i])
                count++;
        }
        return arr.length-count;
    }

    static int odddigit(int n){
        int sum =0;
        while(n>0){
            int digit=n%10;
            if(digit%2!=0){
                sum +=digit;
            }
            n /=10;
        }
        return sum;
    }
    static boolean isPrime(int n){
        int ct =0;
        for(int i =1 ; i<= n; i++){
            if(n%i==0)
                ct++;
        }
        if(ct==2){
            return true;
        }
        return false;
    }
   static int secondLargestprime(int[]arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(isPrime(arr[i])){
                count++;
                if(arr[i]>=max){
                    max2 = max;
                    max =arr[i];
                }
                else if(arr[i]>=max2){
                    max2 = arr[i];
                }
            }
        }
        if(count<2){
            return -1;
        }
        return max2;
   }
}
