public class firstIndex {

    static int firstIdx(int []arr, int idx, int target){
       
       if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }

        return firstIdx(arr,idx+1,target);
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,4,5,6};
        int ans = firstIdx(arr,0,8);

        System.out.println(ans);

    }
}
