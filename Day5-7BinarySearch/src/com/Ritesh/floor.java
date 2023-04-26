package com.Ritesh;

public class floor {
    public static void main(String[] args) {
        int [] arr = {24 ,50, 62, 74, 87, 434, 477, 625, 783, 940 };
        int ans = floor2(arr , 1);
        System.out.println(ans);
    }
    //floor -> just smaller then target.
    static int floor(int []arr , int key){
        int low = 0, high = arr.length-1;
        int floor = -1;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] == key){
                return arr[mid];
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }else {
                //arr[mid] < target -> it can be our answer but we have to look for best answer.
                low = mid+1;
                floor = arr[mid];
            }
        }
        return floor;
    }

    //2nd approach:-
    //after the violation of the condition -> end index will become just lesser than the target
    //if the target is less than all the element of array then on violation -> end will become start-1 . => 0-1 = -1.
    static int floor2(int []arr , int key){
        int low = 0, high = arr.length-1;
        if(key<arr[0]){
            return -1;
        }
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid] == key){
                return arr[mid];
            }
            if (arr[mid] > key) {
                high = mid - 1;
            }else {
                low = mid+1;
              //  floor = arr[mid];
            }
        }
        return high;
    }
}
