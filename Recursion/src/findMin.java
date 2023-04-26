public class findMin {
    public static void main(String[] args) {
        int arr[] = {3,6,1,6,7};
        int ans = findMin(arr, arr.length);
        System.out.println(ans);
    }
    static int findMin(int [] arr , int n){
        //base condition:
        if(n==1)return arr[0];

        //Recursive call:
        return Math.min(arr[n-1] , findMin(arr , n-1));
    }
}
