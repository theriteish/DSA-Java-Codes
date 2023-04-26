import java.util.Scanner;

public class debugger {
    public static void main(String[] args) {
     //  Scanner sc=new Scanner(System.in);
  //     int t=sc.nextInt();
     //  int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(n-i+1);
//            }
//            System.out.println();
//        }
//        int flag =0;
//        for (int i =t; i <=n ; i++) {
//
//            if(strongNo(i)){
//                flag++;
//                System.out.print(i+ " ");
//            }
//        }
//        if(flag==0){
//            System.out.println(0);
//        }

//        int []arr = new int[n];
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        secondLargest(arr);

    //    Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =2 ; i<=n ; i++){
//            boolean flag = true;
//            for(int j =2 ; j<=n; j++){
//                if((isPrime(i) && isPrime(j)) && (i+j==n)){
//                    System.out.print(i+" "+ j);
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag==false)
//                break;
//        }
//
//        int tc = sc.nextInt();
//        for(int t = 1 ; t<=tc ; t++){
//
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int [][]mat = new int [n][m];
//            for(int i =0; i<n; i++){
//                for(int j =0 ; j<m ; j++){
//                    mat[i][j] = sc.nextInt();
//                }
//            }
//            for(int i =0; i<m; i++){
//                for(int j =0 ; j<n ; j++){
//                    System.out.print(mat[j][i]+" ");
//                }
//            }
//        }





    }


    static boolean isPrime(int n){
        int ct =0;
        for(int i =1 ; i<=n ; i++){
            if(n%i==0)
                ct++;
        }
        if(ct==2){
            return true;
        }
        return false;
    }
    static void perfectNumber(int n){
        int sum =0;
        for(int i =1; i<n; i++){
            if(n%i==0){
                sum +=i;
            }
        }
        if(sum==n){
            System.out.println(n);
        }
    }
    static int factorial(int n){
        int fact =1;
        for(int i =1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    static boolean strongNo(int n){
        int temp =n; int f =0;
        int sum =0;
        while(temp!=0){
            int d = temp%10;
            f = factorial(d);
            sum +=f;
            temp = temp/10;
        }
        return sum == n;
    }
    static void secondLargest(int [] arr){
        int max =0, max2 =0;
        max= max2 = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
    static void angryProfessor(int [] arr, int n, int k){
        int count =0;
        for(int i =0; i<n; i++){
            if(arr[i]<=0){
                count++;
            }
        }
        if(count >=k){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    static int element(int n , int[]arr, int k){
        int index =0;
        for(int i=0; i<n; i++){
            if(arr[i]>=k){
                return i;
            }
        }

        return n;
    }
}
