import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int [] sqArr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            int sq = (int)Math.pow(arr[i] , 2);
            sqArr[i] = sq;
        }
        bubbleSort(sqArr);
        for(int a: sqArr){
            System.out.print(a+" ");
        }
    }
    static void bubbleSort(int [] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

