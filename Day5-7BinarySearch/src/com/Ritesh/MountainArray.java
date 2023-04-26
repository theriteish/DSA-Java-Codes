package com.Ritesh;

public class MountainArray {
    public static void main(String[] args) {

        int arr[] = {0,1,2,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low +(high-low)/2;

            //check if we are in the increasing area:
            if(arr[mid]>arr[mid-1]){
                low = mid;
            }
            //check if we are in the decreasing area:
            else if(arr[mid]>arr[mid+1]){
                high = mid;
            }
        }
        return low; //or high whatever you want
    }
    static int mountainPeak(int []arr){
        int start = 0 , end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //we are in descending part of the array -> that means more potential answers exists in the left.
                //we have no idea about arr[mid-1] , if it is greater or not?
                end = mid;
            }else if(arr[mid]<arr[mid+1]){
                //we are in the ascending part of the array -> that means more potential answers exists in the right.
                start = mid+1;
            }
            //both the conditions are finding the greater elements only
            //there will be a point when both find its maximum and it will point to the same index.
            //bcoz in both the checks start and end are trying to find the maximum element only
            //and hence,when they point to just onr element , that is the max one bcoz that is what the checks say
        }
        return start; //or end -> both are pointing to the same element so doesnot matter.
    }
}
