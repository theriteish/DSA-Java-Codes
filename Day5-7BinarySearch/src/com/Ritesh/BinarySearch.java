package com.Ritesh;

import java.util.Arrays;

public class BinarySearch {

    static int  binarySearch(int arr[] , int target){
       int start = 0 , end = arr.length-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           if(arr[mid]>target){
               end = mid -1;
           }else if(arr[mid]<target){
               start = mid+1;
           }else{
               //arr[mid] == target:
               return mid;
           }
       }
       return -1;
    }
    static int dscBinarySearch(int []arr , int key){
        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] arr = {1,3,4,6,7,9};
        int [] dsc = {9,7,5,4,3,2};
        int target = 4;
        int ans = dscBinarySearch(dsc , target);
        System.out.println(ans);
    }
}
