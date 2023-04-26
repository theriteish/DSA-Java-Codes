import java.util.Scanner;

public class AsSorting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        ASsort3(array,n);
    }
    static void ASsort3(int arr[], int n)
    {
        // Write your code here
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    System.out.println("("+arr[i]+"," +" "+ arr[j]+")");
                }
            }
        }

    }
}
