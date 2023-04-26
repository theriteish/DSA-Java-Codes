public class sumArray {
    public static void main(String[] args) {
        int [] arr = {2,5,6,7,8};
        int ans = sum(arr , arr.length);
        System.out.println(ans);
    }
    public static int sum(int arr[], int i){
        // Base Condition:
        if(i==1)return arr[0];
        //Recursive call:
        return arr[i-1] + sum(arr,i-1);
    }
}
