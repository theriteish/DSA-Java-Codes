import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        //possible substrings of a string:
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // total no. of substring  = n(n+1)/2
        // substrings last index are not included so we have to take i & j such that all possible substring are included.
        for(int i =0; i<str.length();i++){
            for(int j =i+1; j<=str.length(); j++){
                System.out.println(subString(str , i , j));
            }
        }
    }
    static String subString(String str , int start , int end){
        StringBuilder ans = new StringBuilder();
        for(int i=start; i<end; i++){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
}
