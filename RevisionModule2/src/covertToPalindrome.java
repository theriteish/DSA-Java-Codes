public class covertToPalindrome {
    public static void main(String[] args) {
        System.out.println(convertToPalindrome("abbnbbca"));

    }
    static boolean convertToPalindrome(String s){
        int start = 0 , end = s.length()-1 ;
        int removed =0;
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                if(s.charAt(start+1) == s.charAt(end)){
                    start++;
                }else if(s.charAt(start) == s.charAt(end-1)){
                    end--;
                }else{
                    return false;
                }
                removed++;
            }
            if(removed>1)return false;
        }
        return true;
    }
}
