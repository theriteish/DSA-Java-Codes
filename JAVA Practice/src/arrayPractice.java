import java.util.Arrays;
import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
//        int sum =0;
//        for(int i =0; i<n-1; i++){
//            for(int j =i+1; j<n; j++){
//                if(Math.abs(arr[i]-arr[j])<k){
//                    sum +=(arr[i]+arr[j]);
//                }
//            }
//        }
//        System.out.println(sum);

////        for(int i =0; i<n; i++){
////            arr[i] = sc.nextInt();
//        }
//        median(arr,n);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for(int i =0 ; i<n; i++){
//            arr [i] = sc.nextInt();
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int count =0;
//
//        for(int i =0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                for(int k = j+1; k<n ; k++){
//                    if(Math.abs(arr[i]-arr[j])<=a  &&  Math.abs(arr[j]-arr[k])<=b  &&  Math.abs(arr[i]-arr[k])<=c){
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//
//    }
//    static void median(int []arr, int n){
//        Arrays.sort(arr);
//        int med = 0;
//        if(n%2!=0){
//            med = arr[n/2];
//        }
//        med = (arr[(n-1)/2]+arr[n/2])/2;
//        System.out.println(med);
//
//        int [] [] mat = { {1 ,2, 3},
//                          {4, 5, 6},
//                          {7, 8 ,9}};

//        for(int i =0; i<mat.length; i++){
//            System.out.println(Arrays.toString(mat[i]));
//        }
//        for(int[] a : mat){
//            System.out.println(Arrays.toString(a)) ;
//        }

//        int [] temp = {1,4,5,5,8};
//        System.out.println(Arrays.toString(temp));

//        int [] arr1 = new int[n];
//        for(int i=0; i<n; i++){
//            arr1[i] = sc.nextInt();
//        }


//        int [] arr2 = new int[m];
//        for(int i=0; i<n; i++){
//            arr2[i] = sc.nextInt();
//        }
//        int sum1 = sum(arr1);
//        int sum2 = sum(arr2);
//        if(sum1>sum2){
//            System.out.println("first array is larger");
//        }
//        else{
//            System.out.println("second array is larger");
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int m = sc.nextInt();

        int [][] mat = new int[n][m];
        for (int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
//        int x= sc.nextInt();
//        int y = sc.nextInt();
//        int[][] mat2 = new int [x][y];
//        for(int i = 0; i<x; i++){
//            for(int j =0; j<y; j++){
//                mat2[i][j] = sc.nextInt();
//            }
//        }
     //   matrixMultiplication(mat , n , m, mat2 , x,y);

      // altMatrixSum(mat);
      //  uprLwrTriangleSum(mat);

     //   boolean ans = isToeplitz(mat);
       // System.out.println(ans);
//        int []arr = new int [n];
//        for(int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int ans = diffPairs(arr, m);
     //   transpose(mat , n, m);
     //   clockwise_90Degree(mat ,n ,m);
     //   booleanMatrix(mat , n , m);


        boundaryTraverse(mat , n , m);

    }
    public void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output
        int [][]product = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j =0; j<n ; j++){
                for(int k =0; k<n ; k++){
                    product[i][j] +=matrix1[i][k]*matrix2[k][i];
                }
            }
        }
        for(int i =0; i<n ; i++){
            for(int j =0 ; j<n ; j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void boundaryTraverse(int [][]mat , int n, int m){
       int top = 0;
       int bottom = n-1;
       int left =0;
       int right = m-1;
       int c =0;
       //1st row:
        for(int i =left ; i<=right && c<m*n; i++){
            System.out.print(mat[top][i]+" ");
            c++;
        }
        top++;
        //last column:
        for(int i = top; i<=bottom && c<m*n; i++){
            System.out.print(mat[i][right]+" ");
            c++;
        }
        right--;
        //last row;
        for(int i = right; i>=left &&c<m*n; i--){
            System.out.print(mat[bottom][i]+" ");
            c++;
        }
        bottom--;
        //first column:
        for(int i = bottom; i>=top && c<m*n; i--){
            System.out.print(mat[i][left]+" ");
            c++;
        }
    }
    static void boundaryTraversal(int [][]mat ,int n,int m ) {
        for(int i =0 ; i<n ; i++){
            for(int j =0; j<m; j++){
                if(i==0){
                    System.out.print(mat[i][j]+" ");
                }
                else if(j == m-1){
                    System.out.print(mat[i][j] +" ");
                }
               else if(i==n-1){
                    System.out.print(mat[i][j]+" ");
                }
                else if(j == 0){
                    System.out.print(mat[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
           System.out.println();
        }
    }


    static void matrixMultiplication(int [][]mat1 , int row1 , int col1 , int[][]mat2 , int row2, int col2){
        int prod[][] = new int [row1][col2];
        for(int i =0; i<row1; i++){
            for(int j =0; j<col2; j++){
                for(int k =0; k<col1 ; k++ ){
                    prod[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(int i =0; i<row1; i++){
            for(int j =0; j<col2; j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void booleanMatrix(int [][]arr , int row , int col){
        for(int i =0 ;i<row; i++){
            for(int j =0; j<col; j++){
                if(arr[i][j]==1){
                    for(int k =0; k<col; k++){
                        arr[i][k] =1;
                    }
                    break;
                }
            }
        }
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void clockwise_90Degree(int [][]mat , int row , int col){
        int trans [][] = new int [col][row];      // row become the column of transpose matrix.
        for(int i =0; i<col;i++){
            for(int j =0 ; j<row; j++) {
                trans[i][j] = mat[j][i];
            }
        }
        //rotating:
        int start =0;
        int end =row-1;   // swapping of columns.
        while(start<end) {
            for (int i = 0; i < row; i++) {
                int temp = trans[i][start];
                trans[i][start] = trans[i][end];
                trans[i][end] =temp;
            }
            start++;
            end--;
        }
        for(int i =0; i<col; i++){
            for(int j =0; j<row; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transpose(int [][]arr , int row , int col){
        for(int i =0; i<col;i++){
            for(int j =0 ; j<row; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    static boolean isToeplitz(int [][]arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =0; j<arr[i].length-1; j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    static int diffPairs(int []arr , int target){
       int count=0;
       for(int i =0; i<arr.length-1; i++){
            for(int j =0; j<arr.length; j++){
                if(i-j==target || j-i == target)
                    count++;
            }
        }
       return count;
    }
    static void uprLwrTriangleSum(int [][]arr){
        int upperSum =0;
        int lowerSum =0;
        for (int i = 0; i < arr.length; i++) {
            for(int j =0; j<arr[i].length; j++){
                if(i>=j){
                    lowerSum +=arr[i][j];
                }
                if(j>=i){
                    upperSum +=arr[i][j];
                }
            }
        }
        System.out.println(upperSum);
        System.out.println(lowerSum);
    }
    static void altMatrixSum(int [][]arr){
        int sumB =0;
        int sumW = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                if((i+j)%2==0){
                    sumB +=arr[i][j];
                }
                else {
                    sumW +=arr[i][j];
                }
            }
        }
        System.out.println(sumB);
        System.out.println(sumW);
    }
    static int absoluteDifference(int [][]arr){
        int sumA = 0;
        int sumB = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                if(i == j){
                    sumA += arr[i][j];
                }
                if(i+j == arr.length-1){
                    sumB +=arr[i][j];
                }
            }
        }
        int ans = sumA -sumB;
        return Math.abs(ans);
    }
    static int sumOfDiagonals(int [][]arr){
       int sumA =0;
       int sumB =0;
       for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                if(i ==j){
                    sumA +=arr[i][j];
                }
                if(i+j ==arr.length-1 && i!=j){
                    sumB +=arr[i][j];
                }
            }
        }
       return sumA+sumB;
    }
    static int sum(int []arr){
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }
}
