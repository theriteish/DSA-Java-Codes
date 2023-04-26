package com.Ritesh.debugger;

import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {

    }

    static int MaxSwap(int num){
        // your code here
        String str = String.valueOf(num);
        char [] arr = str.toCharArray();
        descSort(arr,arr.length);
        String ans = Arrays.toString(arr);
        return Integer.parseInt(ans);
    }
    static void descSort(char[]arr, int n){
        //Bubble sort:
        for(int i=0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j+1]>arr[j]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
