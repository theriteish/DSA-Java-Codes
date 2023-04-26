package com.Ritesh;

public class OrderAgnaustic {
    public static void main(String[] args) {

        int [] arr = {1,4,5,6,8,9};
        int [] dsc = {9,7,5,4,3,2};
        int ans = orderAgnaustic(dsc ,4 );
        System.out.println(ans);
    }
    static int orderAgnaustic(int [] arr , int key){
        int low = 0 , high = arr.length-1;

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
