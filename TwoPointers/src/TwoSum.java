import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            if(nums[i]+nums[j] > target){
                if(nums[i+1]<nums[i] && nums[j-1]>nums[j]){
                    i++;
                }else{
                    j--;
                }
            }else if(nums[i] + nums[j] < target){
                if(nums[i+1]>nums[i] && nums[j-1]<nums[j]){
                    i++;
                }else{
                    j--;
                }
            }else{
                return new int[] {i,j};
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int [] ans = twoSum(new int []{3,2,4},6);
        System.out.println(Arrays.toString(ans));

    }
}

