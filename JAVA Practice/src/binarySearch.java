import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {5 ,7,7, 8, 8, 10};
//        int target = 12;
////        int ans  = floor(arr , 66);
////        System.out.println(ans);
//        int []ans = firstLastIdx(arr , target);
//        System.out.println(Arrays.toString(ans));
        findPosition(arr , 6, 8);
    }
    static int floor(int []arr , int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end -start)/2;
            if(key == arr[mid]){
                return arr[mid];
            }
            if(key>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return arr[end];
    }
    static int orderAgnosticBs(int []arr , int key){
        int s =0;
        int e = arr.length -1;
        while(s<=e){
            int m = s +(e-s)/2;
            if(key==arr[m]){
                return m;
            }
            if(arr[s]<arr[e]){
                if(key >arr[m]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
            else {
                if(key>arr[m]){
                    e = m-1;
                }
                else{
                    s = m+1;
                }
            }
        }
        return -1;
    }
    static int binarySearchDsc(int []arr , int key){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s +(e -s)/2;
            if(key==arr[m]){
                return m;
            }
            if(key>arr[m]){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return -1;
    }
    static int binarySearchAsc(int []arr , int key){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key>arr[mid]){
                start = mid+1;
            }
            else if(key<arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
    static int[] firstLastIdx(int []arr , int key){
        int [] ans = {-1,-1};
        int start =0;
        int end = arr.length-1;

        //first we find the first index:
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                ans[0] = mid;
                //for the first index we will keep searching at the left:
                end = mid-1;
            }
             else if(key>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        //we will find the last index now:
         start =0;
         end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(key == arr[mid]){
                ans[1] = mid;
                //for the last index we will keep searching at the Rigth:
                start = mid+1;
            }
            else if(key>arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void findPosition(int arr[], int n,int k)
    {
        int ans[] = {-1,-1};
        // Binary search for the first index:
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(k == arr[mid]){
                ans[0] = mid;
                //for finding the first index we have to keep searching in the left:
                end = mid-1;
            }else if(k>arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        //Binary search for last index:
        while(start<=end){
            int mid = start +(end-start)/2;
            if(k == arr[mid]){
                ans[1] = mid;
                //for finding the last index we have to keep searching in the right:
                start = mid+1;
            }else if(k>arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
