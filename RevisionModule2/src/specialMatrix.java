import java.util.Scanner;

public class specialMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] mat = new int [n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(special(mat,n));
    }
    static int special(int matrix[][] , int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==j || i+j == n-1){
                    if(matrix[i][j] == 0){
                        return 0;
                    }
                }else{
                    if(matrix[i][j] !=0){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
