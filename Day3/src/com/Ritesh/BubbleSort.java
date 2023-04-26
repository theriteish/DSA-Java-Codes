package com.Ritesh;

import java.util.Arrays;

public class BubbleSort {

    //Time Complexity :-
    // Best case: O(N) -> when array is already sorted
    //worst case : O(N*N)
    static void bubbleSort(int []arr){
        for(int i=0; i<arr.length; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++){ //everytime if one element is sorted we dont want to apply sorting in it.
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {2,4,6,2,1,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
