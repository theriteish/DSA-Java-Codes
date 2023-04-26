import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {

        String s = "abc dca";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str == null || str.length() ==0){
            return true;
        }
        int halfLength = str.length()/2;
        for(int i =0; i<=halfLength; i++){
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
