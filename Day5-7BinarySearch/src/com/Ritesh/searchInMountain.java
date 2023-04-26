package com.Ritesh;

public class searchInMountain {
    public static void main(String[] args) {

        int [] arr = {1};
        int target = 4;
        //1.find the peak element.
        //2.Binary search in ascending part.
        //3.Binary search in descending part.

        int ans = mountainPeak(arr);
        System.out.println(ans);


    }
    static int searchMountain(int []arr, int target){
        int peak = mountainPeak(arr);

        int firstSearch = orderAgnaustic(arr,target,0,peak);
        if(firstSearch!=-1){
            return firstSearch;
        }
        return orderAgnaustic(arr,target,peak+1,arr.length-1);
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
        return end; //or end -> both are pointing to the same element so doesnot matter.
    }

    static int orderAgnaustic(int [] arr , int key , int low, int high){

        boolean isAsc = arr[low] < arr[high];
        if(isAsc){
            while(low<=high){
                int mid = low+(high-low)/2;
                // if target == mid that means this is our index:- mid index will always gives us the target element
                if( arr[mid] == key){
                    return mid;
                } else if(arr[mid]<key){
                    //we have to search in the right side of array:
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }else{
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
        }
        return -1;
    }
}
