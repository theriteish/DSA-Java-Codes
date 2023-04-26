import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        printSubseq("" , "abc");
        System.out.println(subseqRet("", "abs"));
    }
    static void printSubseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubseq(p+ch, up.substring(1));
        printSubseq(p, up.substring(1));
    }
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> take = subseqRet(p+ch,up.substring(1));
        ArrayList<String> notTake = subseqRet(p, up.substring(1));
        take.addAll(notTake);
        return take;
    }
}
