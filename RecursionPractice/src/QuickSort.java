import java.util.Arrays;

public class QuickSort {

    static void partition(int []arr , int pivot){
        int i=0;
        int j =0;
        int ei = arr.length-1;

        while(i<=ei){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
    }
    public static int partitionPivot(int[] arr, int pivot, int si, int ei){
        int i = si;
        int j = si;

        while(i<=ei){
            if(arr[i]<=pivot){ // increase smaller area
                swap(arr,i,j);
                i++;
                j++;
            } else { // increase larger area
                i++;
            }
        }

        return j-1;
    }
    public static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        //we are taking end as pivot
        int pivot = arr[ei];

        int pidx = partitionPivot(arr, pivot, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
    }
    static void swap(int []arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int []arr = {1,2,6,8,9,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
