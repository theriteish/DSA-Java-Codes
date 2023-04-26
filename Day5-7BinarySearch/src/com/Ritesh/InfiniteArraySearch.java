package com.Ritesh;

public class InfiniteArraySearch {
    public static void main(String[] args) {

     int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
     int ans = ans(arr,10);
        System.out.println(ans);
    }
    static int ans (int []arr ,int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range -> target should be less than end.
        //we will keep doubling the size while my target is greater than end
        //if my target element is not greater than end that means it lies in the range

        while(target>arr[end]){
            int newStart = end+1;
            //double the box value:
            //newEnd = previousEnd + 2*sizeOfBox
            end = end + 2*(end - start +1);
            start = newStart;  //we have to use the value of start in above formula thats why we didint update start before.
        }

        return InfiniteBinarySearch(arr,target,start,end);
    }
    static int InfiniteBinarySearch(int []arr , int target, int start , int end){
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
}
