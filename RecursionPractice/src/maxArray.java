public class maxArray {

    static int max(int []arr, int idx){
        if(idx==arr.length){
            return 0;
        }

        return Math.max(arr[idx], max(arr,idx+1));
    }

    public static void main(String[] args) {
        int []arr = {11,7,8,4,5,6};
        int ans = max(arr,0);
        System.out.println(ans);
    }
}

