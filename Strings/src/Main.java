import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
//            String s = sc.next();
//            String [] arr = s.split("[.]");
//    //    System.out.println(Arrays.toString(arr));
//            StringBuilder sb = new StringBuilder();
//            for(int i = arr.length-1; i>=0; i--){
//                    sb.append(arr[i]);
//                    if(i!=0)sb.append('.');
//            }
//            String ans =sb.toString();
//        System.out.println(ans);
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        String [] arr = new String[n];
//        for(int i =0; i<arr.length; i++){
//            arr[i] = sc.nextLine();
//        }
////
//        String str = "ihilada";
//     Capitalize(str);
//        System.out.println(str);
        String s = "ebcbbececabbacecbbcbe";
//        boolean ans = validPalindrome(s);
//
//        System.out.println(ans);
        System.out.println(strangeString(4));


    }

        static String strangeString(int n) {
            //Write your code here
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(n>0){
                sb.insert(0,(char)('a' + (char)(i)));
                i++;
                n--;
                if(n==0)break;
                sb.insert(i,(char)('a' + (char)(i)));
                i++;
                n--;
            }
            return sb.toString();
        }
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    /* Check is s[i...j] is palindrome. */
    private static  boolean isPalindrome(String s, int i, int j) {

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
//    public static boolean validPalindrome(String s) {
//        int delete = 0;
//        int start=0, end=s.length()-1;
//        while(start<end){
//            if(s.charAt(start)==s.charAt(end)){
//                start++;
//                end--;
//            }else{
//                 if(s.charAt(start+1) == s.charAt(end)){
//                    start++;
//                }else if(s.charAt(start) == s.charAt(end-1)){
//                    end--;
//                }else{
//                     return false;
//                 }
//                delete++;
//            }
//            if(delete>1){
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        for (int j = 0; j < n; ++j)
            if (i < m && name.charAt(i) == typed.charAt(j))
                ++i;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                return false;
        return i == m;
    }
    public static  String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int idx = columnNumber%26;
            char ch = (char)('A' + idx);
            ans.append(ch);
            columnNumber /= 26;
        }
        ans = ans.reverse();
        return ans.toString();
    }
    public static String toLowerCase(String s) {
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char ch = (char)('a' + s.charAt(i)-'A');
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    static void Capitalize(String s){
      //  char c = s.charAt(0);
       StringBuilder sb = new StringBuilder();
       sb.append( Character.toUpperCase(s.charAt(0)));
       sb.append(s.substring(1));
       s =  sb.toString();

    }
    public static void ptice(int n, String key) {
        // Write your code here and print output in this function
        String ansAdrian ="ABC";
        String ansBruno = "BABC";
        String ansGoran = "CCAABB";
        int ctA = 0, ctB =0, ctG = 0;

        for(int i =0; i<key.length();i++){
            if(key.charAt(i)==ansAdrian.charAt(i%3)){
                ctA++;
            }
            if(key.charAt(i)==ansBruno.charAt(i%4)){
                ctB++;
            }
            if(key.charAt(i)==ansGoran.charAt(i%6)){
               ctG++;
            }
        }
        int ans = Math.max(Math.max(ctA,ctB),ctG);
        System.out.println(ans);
        if(ctA==ans){
            System.out.println("Adrian");
        }
        if(ctB==ans){
            System.out.println("Bruno");
        }
        if(ctG==ans){
            System.out.println("Goran");
        }

    }
    static String abr(String s){
        StringBuilder sb = new StringBuilder();
        int count = s.length()-2;
        sb.append(s.charAt(0));
        sb.append(count);
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
    }

}
