package com.Ritesh;

public class ceil {
    public static void main(String[] args) {
        int [] arr = {24 ,50, 62, 74, 87, 434, 477, 625, 783, 940 };
        int ans = ceil2(arr , 950);
        System.out.println(ans);
    }
    //ceil -> just greater element.
    static int ceil(int []arr , int key){
        int low = 0 , high = arr.length-1;
        int ceil = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                //it can be our potential answer but we need to check the best possible answer.
                ceil = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ceil;
    }

    //2nd approach -> after the violation of the while loop condition -> start index will become just greater element than the target element:
    //if the target is greater than all the element in that condition -> no ceil found -> on the voilation our start index will be equal to end+1 or length of array.
    static int ceil2(int []arr , int key){

        if(key>arr[arr.length-1] ){
            return -1;
        }
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] == key){
                return arr[mid];
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
}
