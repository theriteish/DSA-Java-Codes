import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int [] arr = {6,7,3,4,2};
        bubbleSort(arr , arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int [] arr , int n){
        if(n==1)return;
        boolean swapped = false;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                swap(arr , i , i+1);
                swapped = true;
            }
        }
        if(!swapped){
            return;
        }
        bubbleSort(arr , n-1);
    }
    static void swap(int []arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
