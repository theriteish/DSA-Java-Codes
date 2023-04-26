import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search {
    public static void main(String[] args) {

//        int [][] arr = {
//                {10 ,20, 30, 40},
//                {15, 25, 35, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50}
//        };
//        System.out.println(Arrays.toString(search(arr ,39)));
        int[] mat = {1, 1, 0, 3, 12};
        moveZeroes(mat);
        System.out.println(Arrays.toString(mat));

//        int []arr = {4,3,2,7,8,2,3,1};
//        List<Integer> ans = findDuplicates(arr);
//
//        System.out.println(ans);
    }
    static int [] search(int [][]matrix , int target){
        int r = 0;
        int c = matrix.length-1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int []{ r ,c};
            }
            if(matrix [r][c]<target){
                r++;
            } else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }

    static void sort0(int [] arr){
        int i = 0 , j = arr.length-1;
        while(i<j){
            if(arr[i] == 0 && arr[j] !=0){
                swap(arr,i,j);
                i++;
                j--;
            }else if(j==0){
                j--;
            }
        }
    }
    static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        //j will always in the first 0 position -> where 0 occurs for the first time.
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
               swap(nums,i,j);
                j++;
            }
        }
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int []freq = new int [nums.length];

        for(int i=0; i<nums.length; i++){
            int idx = nums[i]-1;
            freq[idx]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]>1){
                int num = i+1;
                ans.add(num);
            }
        }
        return ans;
    }
}

