import java.util.Arrays;

public class sorting012 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,0,0,0,2,2,1};
        //we will use three pointers here;
        int i =0 , j = 0, k=arr.length-1;
        while(i<=k){
            if(arr[i]==1){
                i++;
            }else if(arr[i]==0){
                swap(arr ,i, j);
                i++;
                j++;
            }else{
                swap(arr ,i ,k);
                k--;
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
