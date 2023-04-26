import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int []arr = {3,6,7,8,9};
        reversearray(arr , 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int arr[], int start, int end)
    { //Base Condition:
        if(start==end){
            System.out.print(arr[start]);
            return;
        }
        //Recursive call:
        System.out.print(arr[end]+" ");
        reverseArray(arr , start , end-1);
    }
    static void reversearray(int []arr, int start, int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reversearray(arr , start+1, end-1);
        }
    }
}

