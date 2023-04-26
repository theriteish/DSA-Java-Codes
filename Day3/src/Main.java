import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int [] arr = {2,5,5,11};
//      int ans []  = twoSum(arr , 10);
//        System.out.println(ans.toString());
        int [] a = {1,0,0};
        int [] b = {9,9,9};
        int []ans = isGreaterArray(a,b);
       // System.out.println(ans.toString());

        for(int ele:ans){
            System.out.print(ele+" ");
        }


    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            if(nums[i]+nums[j] > target){
                if(nums[i+1]<nums[i] || nums[j-1]>nums[j]){
                    i++;
                }else{
                    j--;
                }
            }else if(nums[i] + nums[j] < target){
                if(nums[i+1]>nums[i] || nums[j-1]<nums[j]){
                    j--;
                }else{
                    i++;
                }
            }else{
                return new int[] {i,j};
            }
        }
        return new int []{-1,-1};
    }

    static int [] isGreaterArray(int []a , int []b){
        if(a.length > b.length){
            return subtract(a,b);
        }else if(a.length < b.length){
            int ans[] = subtract(b,a);
            ans[0] = -ans[0];
            return ans;
        }else{
            //now length is equal && we are assuming that a is greater:
            boolean aIsGreater = true;
            for(int i=0; i<a.length; i++){
                if(b[i]>a[i]){
                    aIsGreater = false;
                    break;
                }else if(a[i] > b[i]){
                    break;
                }
            }
            if(aIsGreater){
                return subtract(a,b);
            }else{
                int ans [] = subtract(b,a);
                ans[0] = -ans[0];
                return ans;
            }
        }
    }

    static int [] subtract(int [] a , int [] b){
        int [] sub = new int [a.length]; //we are assuming that a is greater.
        int i =a.length-1;
        int j=b.length-1;
        int k = sub.length-1;
        int borrow = 0;

        while(k>=0){
            int digit = borrow;
            if(i>=0){
                digit += a[i];
            }
            if(j>=0){
                digit -=b[j];
            }
            if(digit<0){
                digit += 10;
                borrow = -1;
            }else{
                borrow = 0;
            }
            sub[k] = digit;
            i--;
            j--;
            k--;
        }
        //to remove starting zeros:
        int idx = 0;
        while(idx<sub.length){
            if(sub[idx] == 0){
                idx++;
            }else{
                break;
            }
        }
        int ans[] = new int [sub.length - idx];
        int id = 0;
        while(idx<sub.length){
            ans[id] = sub[idx];
            id++;
            idx++;
        }
        return ans;
    }
}