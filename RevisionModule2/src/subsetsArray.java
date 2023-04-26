public class subsetsArray {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        printSubset("" , arr, arr.length);
    }
    static void printSubset(String p, int []arr , int n){
        if(n==0){
            System.out.println(p);
            return;
        }

        //if we take an element:
        printSubset(arr[n-1]+p, arr, n-1);
        //if we dont take:
        printSubset(p, arr, n-1);
    }
}
