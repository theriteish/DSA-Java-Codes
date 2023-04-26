import java.util.Scanner;

public class equivalentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i =0; i<word1.length; i++){
            sb1.append(word1[i]);
        }
        for(int i =0; i<word2.length; i++){
            sb2.append(word2[i]);
        }
        if(sb1.equals(sb2)){
            return true;
        }
        return false;
    }
}
