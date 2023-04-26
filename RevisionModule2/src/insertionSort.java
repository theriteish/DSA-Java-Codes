import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //sort the array in two parts -> one part is sorted & another part is unsorted:
    //sorted area increases & unsorted area decreases:

    static void insertionSort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            //initially 0th element is sorted:
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }


    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
