public class checkPalindrome {

    static boolean isPalindrome(int []arr , int si , int ei){
        //base case :-
        if(si > ei) return true;

        if(arr[si] != arr[ei]) return false;

        boolean ans = isPalindrome(arr , si+1 , ei -1);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4,11,4,2,1};
        boolean ans = isPalindrome(arr , 0, arr.length-1);
        System.out.println(ans);
    }
}
