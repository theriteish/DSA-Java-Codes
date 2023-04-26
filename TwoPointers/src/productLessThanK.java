public class productLessThanK {

    public static  int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0)return 0;
        int i =0;
        int j = 0;
        int product = 1;
        int count = 0;
        while(i<nums.length){
            //introduction:
            product *=nums[i];

            //shrink untill windows become valid:
            while(j<i && product>=k){
                product /= nums[j];
                j++;
            }
            count += (i-j+1);
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = { 1,2,3};
        int ans = numSubarrayProductLessThanK(arr , 0);
        System.out.println(ans);
    }
}
