import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String str = "abccbc";
        palindromeSubStrs(str);
    }
    static boolean isPalindrome(String s){
        int start = 0 , end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    static void palindromeSubStrs(String s) {
        //Write your code here
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sub = s.substring(i,j);
                if(isPalindrome(sub)){
                    list.add(sub);
                }
            }
        }
        Collections.sort(list);
        //Remove duplicate & print:
        for(int i=0; i<list.size()-1; i++){
            if(!list.get(i).equals(list.get(i+1))){
                System.out.println(list.get(i));
            }
        }
        //printing the last element:
        System.out.println(list.get(list.size()-1));
    }
}