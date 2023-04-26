package com.Ritesh;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int [] arr = {5,4,6,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        //in this algorithm original array was not modified , a new object was created and returned:

    }

    static int [] mergeSort(int []arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        //we will divide the array into two equal parts , and send it to a recursion call for left half sorting & right half sorting:

        int [] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr , mid,arr.length));

        return merge(left , right);
    }

    static int [] merge (int[] first ,int [] second ){
        int [] ans = new int [first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                ans[k] = first[i];
                i++;
            }else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        //It may be possible that either one of the array is not completely merged:
        //for copying remaining elements:

        //if first array remains to be merged then :
        while(i<first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        // if second array remains to be merged then :
        while(j<second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        //In any situation both loop will not run either first will run or second will run:
        return ans;
    }
}
