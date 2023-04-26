public class isPalindromeString {
    public static void main(String[] args) {
       String str = "abbcbba";
       boolean ans = isPalindrome(str , 0 , str.length()-1);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String str , int start , int end){
       if(start == end) return true;
       if(str.charAt(start) != str.charAt(end)) return false;

       //till this condition if we didnt find false it means it is true:
       if(start < end){
           return isPalindrome(str , start+1, end-1);
       }
       return true;
    }
}
