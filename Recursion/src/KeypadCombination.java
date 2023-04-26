import java.util.ArrayList;
import java.util.Collection;

public class KeypadCombination {
    public static void main(String[] args) {
        keypadCombi("" , "103");
        System.out.println(keypadCombiRet("" , "34"));
    }
    static String []code = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    static void keypadCombi(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0';
        String key = code[digit];
        for(int i = 0; i<key.length(); i++){
            keypadCombi(p+key.charAt(i) , up.substring(1));
        }
    }
    //Returning an arraylist:
    static ArrayList<String> keypadCombiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) -'0';
        String key = code[digit];
        for(int i=0; i<key.length() ; i++){
            char ch = key.charAt(i);
            list.addAll(keypadCombiRet(p+ch , up.substring(1)));
        }
        return list;
    }

}
