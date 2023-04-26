public class MaximumOne {
    static int maxOne(int arr[], int n,int k)
    {
        int i =0 , j =0 , ans =0 , countZero = 0;
        while(i<n){
            //introduce a new person:
            if(arr[i] == 0){
                countZero++;
            }

            //shrink the subarray untill window becomes valid:
            //dercrease count of zero if we are removing 0 while shrinking:
            while(countZero>k){
                if(arr[j] == 0){
                    countZero--;
                }
                j++;
            }
            ans = Math.max(ans , i-j+1);
            i++;
        }
        return ans;
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int ei = 0;
        int si = 0;
        while(ei<nums.length){
            if(nums[ei] == 0){
                int len = ei - si;
                max = Math.max(max,len);
                while(nums[ei] == 0){
                    ei++;
                }
                si = ei;
            }else{
                ei++;
            }
        }
        max = Math.max(max,ei-si);
        return max;
    }

    public static void main(String[] args) {
//        11 2
//        1 1 1 0 0 0 1 1 1 1 0

        int [] arr = { 1 ,1, 0, 1, 1, 1};
        int ans = findMaxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
