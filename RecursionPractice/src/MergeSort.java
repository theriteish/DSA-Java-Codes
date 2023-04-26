import java.util.Arrays;

public class MergeSort {

    public static int [] merge2SortedArrays(int []arr1, int []arr2){
        int n = arr1.length;
        int m = arr2.length;

        int [] ans = new int[n+m];

        int i=0;
        int j=0;
        int k =0;

        while(i<n && j<m){
            if(arr1[i] < arr2[j] ){
                ans[k] = arr1[i];
                i++;
            }else{
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k] = arr2[j];
            j++;
            k++;
        }
        return ans;
    }

    static void mergeSort(int []arr, int si, int ei){
        //Base cond:
        if(si == ei){
            //it means single element in arr -> single elm is always sorted:
            return;
        }

        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        //After sorting both parts :- we then merge
        mergeSorted(arr,si,mid,ei);
    }
    static void mergeSorted(int []arr, int si, int mid, int ei){
        int [] ans = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k =0;

        int ei1 = mid;
        int ei2 = ei;

        while(i<=ei1 && j<=ei2){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=ei1){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j<=ei2){
            ans[k] = arr[j];
            j++;
            k++;
        }
        k=0;
        //copying back from ans to arr:
        for(int idx = si; idx<=ei; idx++){
            arr[idx] = ans[k];
            k++;
        }

    }

    public static void main(String[] args) {
        int []ans = {8,6,7,4,3,56,2,2};
//        int []arr2 = {2,4,6,8,10};
//        int []ans = merge2SortedArrays(arr1,arr2);
        mergeSort(ans, 0, ans.length-1);

        System.out.println(Arrays.toString(ans));
    }
}
