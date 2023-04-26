import java.util.Arrays;

public class sorting1_0 {
    public static void main(String[] args) {
        int [] arr = {0 ,1, 2};
        //we want 1 first then 0 so
        zero_one_two_sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void zero_one_two_sorting(int[] arr){
        // Write code here
        int j = 0; // 0 to j-1 -> 0's area;
        int i = 0; // j to i-1 -> 1's area;
        int k = arr.length -1; // i to arr.length-1 -> 2's area;
        //initially  i and j will be at 0 & k will be at arr.length -1;
        //when i == k , loop will break as all the components will be sorted;

        while(i<=k){
            if(arr[i]==1){
                i++;
            }
            else if(arr[i]==0){
                swap(arr ,i , j);
                i++;
                j++;
            }
            else{
                swap(arr, i , k);
                k--;
            }
        }
    }
    static void swap(int []arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
