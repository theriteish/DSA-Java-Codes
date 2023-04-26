import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public void spirallyTraverse(int[][] matrix, int m, int n) {
        // Your code here
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int dir = 1;
        while (top <= bottom && left <= right) {
            if (dir == 1) {
                //top row:
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
                dir = 2;
            }
            if (dir == 2) {
                //last column:
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
                dir = 3;
            }
            if (dir == 3) {
                //last row:
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
                dir = 4;
            }
            if (dir == 4) {
                //first column:
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
                dir =1;
            }
        }
    }

    static void alterNate(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    static int[][] matrixMultiplication(int[][] mat1, int[][] mat2) {
        int row1 = mat1.length;
        int col1 = mat1[0].length;
        int row2 = mat2.length;
        int col2 = mat2[0].length;

        int[][] prod = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return prod;
    }

    static void BooleanMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = 1;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transpose(int[][] mat, int n) {
        //using constatnt space;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //swapping:
                int temp = mat[i][j];
                mat[i][j] = mat[j][j];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotate90(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            for (int i = 0; i < n; i++) {
                //swapping:
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;

            }
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isToeplitzMatrix(int[][] mat, int m, int n) {
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (mat[i][j] != mat[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static int[] search2d(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static boolean specialMat(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][i] == 0 && mat[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static int findSum(int[][] arr, int n, int m) {
        //Write code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int [][] arr2  = new int[x][y];
//        for(int i =0 ; i<x ; i++){
//            for(int j =0 ; j<y ; j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
        // alterNate(arr , m , n);
        //   matrixMultiplication(arr1 , arr2);
        //  BooleanMatrix(arr1);
        //   transpose(arr1 , m);
        //   rotate90(arr1 , m);
//       boolean ans =  isToeplitzMatrix(arr1 , m , n);
//        System.out.println(ans);

//        int [] ans = search2d(arr1 , 5);
//        for(int a : ans){
//            System.out.print(a +" ");
//        }

//

        //  System.out.println(specialMat(arr1 , n));

    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int secondLargestPrime(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        boolean found = false;
        for (int i = n - 1; i >= 0; i--) {
            if (isPrime(arr[i])) {
                if (found == true) {
                    return arr[i];
                } else {
                    found = true;
                }
            }
            while (i > 0 && arr[i - 1] == arr[i]) {
                i--;
            }
        }
        return -1;
    }

    static int lifeBar(int arr[][], int n, int m) {
        int ans = 0, netCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) count++;
            }
            if (count > netCount) {
                netCount = count;
                ans = i;
            }
        }
        return ans;
    }
}

