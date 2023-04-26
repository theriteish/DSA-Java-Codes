public class equalSum {
    public static void main(String[] args) {
        int [] arr = {5 , 3 ,2};
        System.out.println(splitArray(arr.length, arr));
    }
    static boolean splitArray(int n, int[] arr){
        // write code here
        int sum = sumArray(n , arr);
        if(sum % 2 !=0) return false;
        if(n==1)return false;
        int sumSubArray = sum/2;
        boolean ans = split(sumSubArray , 0 , n ,arr);
        return ans;
    }
    static boolean split(int sum , int currSum , int n , int []arr){
        if(sum == currSum){
            return true;
        }else if(n == 1){
            return false;
        }

        return split(sum , currSum+arr[n-1] , n-1 , arr);
    }
    static int sumArray(int n , int[]arr){
        if(n==0)return 0;
        return arr[n-1]+ sumArray(n-1 , arr);
    }
}
