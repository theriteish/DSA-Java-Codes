import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr = {7,8,9,6,5,4,6,2,1};
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int []arr){
        //select the element and place it to the right place:
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            //find minimum and swap it with first index:
            int minIndex = findMin(arr , i);
            swap(arr , i , minIndex);
        }
    }
    static void selectionSort2(int []arr){
        //select the element and put it in the right place:
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int lastIndex = n-1-i;
            int maxIndex = findMax(arr, 0, n-1-i);
            swap(arr, lastIndex, maxIndex);
        }
    }
    static int findMax(int []arr , int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max])
                max = i;
        }
        return max;
    }
    static int findMin(int []arr , int first){
        int min = first;
        for(int i=first; i<arr.length; i++){
            if(arr[i] < arr[min])
                min = i;
        }
        return min;
    }
    static void swap(int []arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
