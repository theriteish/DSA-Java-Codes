import java.awt.geom.NoninvertibleTransformException;
import java.util.ArrayList;

public class subsequences {
    public static void main(String[] args) {
        String str = "abc";
        subsequenceAscii("" , str);
      //  System.out.println(subseq("", str));
        System.out.println(subseqAscii("" , str));
    }
    static void subsequence(String p, String up){
        //Base Condition:
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //take :
        subsequence(p+ch , up.substring(1));
        //not take:
        subsequence(p , up.substring(1));
    }
    static ArrayList<String> subseq(String p , String up){
        // Base Condition:
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> take =  subseq(p+ch , up.substring(1));
        ArrayList<String> notTake =  subseq(p , up.substring(1));
        take.addAll(notTake);
        return take;
    }
    static void subsequenceAscii(String p, String up){
        //Base Condition:
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        //take :
        subsequenceAscii(p+ch , up.substring(1));
        //not take:
        subsequenceAscii(p , up.substring(1));
        subsequenceAscii(p+(ch +0) , up.substring(1));
    }
    static ArrayList<String> subseqAscii(String p , String up){
        // Base Condition:
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> take =  subseqAscii(p+ch , up.substring(1));
        ArrayList<String> notTake =  subseqAscii(p , up.substring(1));
        ArrayList<String> Ascii =  subseqAscii(p +(ch+0), up.substring(1));
        take.addAll(notTake);
        take.addAll(Ascii);
        return take;
    }
}
