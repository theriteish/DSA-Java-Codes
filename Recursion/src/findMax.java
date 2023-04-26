public class findMax {
    public static void main(String[] args) {
        int arr[] = {8 , 9 , 5 , 4, 5, 6};
        int ans = findMax(arr , arr.length);
        System.out.println(ans);
    }
    static int findMax(int [] arr , int n){
        //base condition;
        if(n==1) return arr[0];

        //Recursive call:
        return Math.max(arr[n-1] , findMax(arr , n-1));
    }
}
