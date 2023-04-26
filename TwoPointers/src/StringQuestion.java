import java.util.Arrays;

public class StringQuestion {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    //first do entire row zero;
                    for(int k=0; k<m; k++){
                        matrix[i][k] = 0;
                    }
                    //we will do our col zero;
                    for(int k=0; k<n; k++){
                        matrix[k][j] = 0;
                    }
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][]arr ={ {1,1,1},
                      {1,0,1},
                      {1,1,1 }};

        setZeroes(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
