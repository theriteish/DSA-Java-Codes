package com.Ritesh;

import java.util.Arrays;

public class SelectionSort {
    //Time Complexity:-
    //worst case -> O(N)
    //Best case -> O(N)
    static void selectionSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            //we find last Index:-
            int lastIndex = arr.length-1-i;
            int maxIndex = findMax(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }
    static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int findMax(int []arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
