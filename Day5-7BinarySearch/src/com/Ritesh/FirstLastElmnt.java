package com.Ritesh;

import java.util.Arrays;

public class FirstLastElmnt {
    static int [] firstLast(int []arr , int target){
        int ans[] = {-1,-1};
        //first we will find the first index:
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(target == arr[mid]){
                //we found the index but still we have to search in the left:
                ans[0] =mid ;
                high = mid-1;
            }else if(target>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        //now we will find the last index:
        low = 0 ;
        high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(target == arr[mid]){
                //we found the index but still we have to search in the right:
                ans[1] =mid ;
                low = mid+1;
            }else if(target>arr[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,3,6,8,9};
        int target = 3;
        int ans [] = firstLast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
