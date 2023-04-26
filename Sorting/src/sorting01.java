import java.util.Arrays;

public class sorting01 {
    public static void main(String[] args) {
        int [] arr = {0, 0, 1, 1 , 0, 1, 1, 0, 1};
        //o to n-1 --> unknown
        // every time we find the 0 we just know the one unknown region;
        //o to j-1--> 0's area
        //j to i-1 --> 1's area
        //when we will find 1 we simply increment and when we find 0 we swap 1 with zero and increment both i & j;
        // in the start
        int i =0 , j=0;
        while(i<arr.length){
            if(arr[i] ==1){
                i++;
            }else{
                swap(arr , i , j);
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
