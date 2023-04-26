import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int []arr){
        //outer loop is the counter loop which counts the bubble and after every outer iteration one bubble will be sorted.
        //total number of bubbles in the worst case will be n-1, so outer loop will run n-1 times.
        for(int i =0; i<arr.length -1; i++){
            boolean swapped = false;
            //after every outer iteration one element will be sorted or one bubble will be fixed son inner loop will iterate n-1-i;
            for(int j =0; j<arr.length - 1 - i; j++){
                if(arr[j]>arr[j+1]){
                    //swap:
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
