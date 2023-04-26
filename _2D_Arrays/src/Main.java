import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////
     //   Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String ans = sortSentence(s);
//        System.out.println(ans);
//        int n = sc.nextInt();
//        int arr[][] = new int [n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        rotateReverse(arr,n);

//        int [] arr = {0,-5,0,0,1,0,2,0};
//        int []ans = solve(arr);
//        System.out.println(Arrays.toString(ans));
      //  System.out.println(cipherPol("abcd" , 2));
//        int []arr = {1,2,1,2};
//        int ans = solve(arr);
//        System.out.println(ans);

//        String ans = reverseNumber("123.567.987");
//        System.out.println(ans);


        System.out.println("Hello world");

    }
    static void ZTranspose(int n, int [][]arr){
        transpose(arr,n);
        for(int i=0; i<n; i++){
            System.out.print(arr[0][i]);
        }
        for(int i=1; i<n; i++){
            System.out.print(arr[i][n-i-1]);
        }
        for(int i=1; i<n; i++){
            System.out.print(arr[n-1][i]);
        }
    }

    static void NTranspose(int n, int [][]arr){
        if(n==1){
            System.out.print(arr[0][0]);
            return;
        }
        transpose(arr,n);
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i][0]+" ");
        }
        for(int i=1; i<n; i++){
            System.out.print(arr[i][i]+" ");
        }
        for(int i=n-2; i>=0; i--){
            System.out.print(arr[i][n-1]+" ");
        }
    }

    static void transpose(int [][]mat , int n){
        //using constatnt space;
        for(int i =0 ; i<n; i++){
            for(int j =i+1 ; j<n; j++){
                //swapping:
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }


    static int solve(int []arr){
        int n = arr.length;

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
               if((j-i+1)%2==1) {
                   for (int m = i; m <= j; m++) {
                       sum += arr[m];
                   }
               }
              ans+=sum;
            }
        }
        return ans;
    }


    static int firstCharDigit(String s){
        char c = s.charAt(0);
        return c-'0';
    }
    static String removeFirst(String s){
        return s.substring(1);
    }

    public static String sortSentence(String s) {

        String [] arr = s.split(" ");

        String [] ans = new String [arr.length];

        for(int i=0; i<arr.length; i++){
            int idx = firstCharDigit(arr[i]) - 1;
            ans[idx] = arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ans.length; i++){
            String str = removeFirst(ans[i]);
            sb.append(str);
            if(i!=arr.length-1) sb.append(" ");
        }
        return sb.toString();
    }




    static String cipherPol(String str , int k){
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for(int i=0; i<str.length(); i++){
            idx = str.charAt(i) + k;
            if(idx>122){
                idx-=26;
            }
            sb.append((char)(idx));
        }
        return sb.toString();
    }

    static void rotateReverse(int [][]mat , int n){
        for(int i =0 ; i< n ; i++){
            for(int j = i+1 ; j<n ; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start =0;
        int end = n-1;
        while(start<=end){
            for(int i =0 ; i<n; i++){
                //swapping:
                int temp = mat[i][start] ;
                mat[i][start] = mat[i][end] ;
                mat[i][end] = temp;

            }
            start++;
            end--;
        }
        for(int i=n-1; i>=0; i--){
            System.out.print(mat[0][i]+" ");
        }
        for(int i=1; i<n; i++){
            System.out.print(mat[i][i]+" ");
        }
        for(int i=n-2; i>=0; i--){
            System.out.print(mat[n-1][i] +" ");
        }
    }
    static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    static String reverseNumber(String s){
        String [] arr = s.split("[.]");

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            String str = reverse(arr[i]);
            ans.append(str);
            if(i!=arr.length-1)ans.append('.');
        }
        return ans.toString();
    }

    static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
   static void sort0(int [] arr){
        int i = 0 , j = arr.length-1;
        while(i<j){
            if(arr[i] == 0 && arr[j] !=0){
                swap(arr,i,j);
                i++;
                j--;
            }else if(j==0){
                j--;
            }
        }
   }
}
