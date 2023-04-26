public class isSorted {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8};
        System.out.println(isSorted(arr , 0));
    }
    static boolean isSorted(int[]arr , int id){
        if(id == arr.length -1) return true;
        return arr[id] < arr[id+1] && isSorted(arr , id+1);
    }
}
