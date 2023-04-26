import java.util.ArrayList;
import java.util.Collections;

public class subSequence {
    public static void main(String[] args) {
        System.out.println(subseqList("" , "abc"));
    }
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch , up.substring(1));
        subseq(p , up.substring(1));
    }
    //Returning an Arraylist of Strings:
    static ArrayList<String> subseqList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(p.length()!=0)
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> pick = subseqList(p+ch , up.substring(1));
        ArrayList<String> notPick  = subseqList(p , up.substring(1));
        pick.addAll(notPick);
        Collections.sort(pick);
        return pick;
    }
}
