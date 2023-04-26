import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr  = {5, 4, 3, 2 , 1};
        selectionSort2(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selectionSort(int [] arr){    //the here we are swapping the maximum elements with the last element, so in (n-1) operations array will be sorted.
        for(int i = 0; i<arr.length-1; i++){
            int lastIndex = arr.length -1-i;
            int maxIndex = getMaxIndex(arr , 0, lastIndex);
            swap(arr , lastIndex , maxIndex);
        }
    }
    public static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int getMaxIndex(int [] arr , int start , int end){
        int max = start;

        for(int i =start; i<=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static int getMinIndex(int [] arr , int start){
        int min = start;

        for(int i =start; i<arr.length; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        return min;
    }
    public static void selectionSort2(int [] arr){    //the here we are swapping the maximum elements with the last element, so in (n-1) operations array will be sorted.
        for(int i = 0; i<arr.length-1; i++){
            int firstIndex = i;
            int minIndex = getMinIndex(arr , i);
            swap(arr , firstIndex, minIndex);
        }
    }
}
