import java.util.Scanner;

public class Revision2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] mat = new int [m] [n];
        for(int i = 0; i<m; i++){
            for(int j = 0 ; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

//        int x= sc.nextInt();
//        int y = sc.nextInt();
//
//        int [][] cat = new int [x] [y];
//        for(int i = 0; i<x; i++){
//            for(int j = 0 ; j<y; j++){
//                cat[i][j] = sc.nextInt();
//            }
//        }

      //  AlternateMatrixTraversal(mat , m , n);

      //  matrixMultiplication(mat ,m, n, cat , x , y);

       booleanMatrix(mat , m , n);

    }
    static void AlternateMatrixTraversal(int [][] mat, int m, int n){
        for(int i =0; i<m; i++){
            if(i%2==0){
                for(int j = 0; j<n; j++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int j = n-1; j>=0; j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
    static void matrixMultiplication(int row1 , int col1, int [][]A , int row2, int col2, int [][]B){

            int [] [] product = new int [row1][col2];
            for(int i =0; i<row1; i++){
                for(int j =0; j<col2; j++){
                    for(int k =0; k<col1 || k<row2; k++){
                        product[i][j] += A[i][k]*B[k][j];
                    }
                }
            }
            for(int i =0; i<row1; i++){
                for(int j = 0; j<col2; j++){
                    System.out.print(product[i][j]+" ");
                }
                System.out.println();
            }
        }

    static void booleanMatrix(int [][]mat ,int m, int n){

        for(int i =0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 1){
                    for(int k =0; k<n; k++){
                        mat[i][k] =1;
                    }
                    break;
                }
            }
        }
        for(int i =0; i<m; i++){
            for(int j =0;j<n; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }

}
