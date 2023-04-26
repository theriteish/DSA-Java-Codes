import java.util.ArrayList;
import java.util.Collections;

public class KeypadCombination{

    static String [] key = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){
        //Base Condition:
        if(str.isEmpty()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        int firstDigit = str.charAt(0) - '0';
        ArrayList<String> ansFrmAbv = getKPC(str.substring(1));

        String s = key[firstDigit];
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            char toAdd = s.charAt(i);
            for(int j=0; j<ansFrmAbv.size(); j++){
                String combination = toAdd+ansFrmAbv.get(j);
                ans.add(combination);
            }
        }
        return ans;
    }
    public static int GetKPC(String str) {
        // Write your code here
        if(str.isEmpty()){
            return 1;
        }
        int firstDigit = str.charAt(0) - '0';
        String s = key[firstDigit];
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            int ansFrmAbv = GetKPC(str.substring(1));
            ans+=ansFrmAbv;
        }
        return ans;
    }

    static String [] keypad = {" ", "ABC" , "DEF" , "GHI" , "JKL", "MNO", "PQRS", "TU", "VWX", "YZ"};
    static ArrayList <String> OldPhone(int n, int[] keys){
        //Base Cond:
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }


        int num = keys[n-1];
        ArrayList<String> ansFrmAbv = OldPhone(n-1 ,  keys);
        ArrayList<String> ans = new ArrayList<>();
        String add = keypad[num];
        for(int i=0; i<add.length(); i++){
            char toAdd = add.charAt(i);
            for(int j=0; j<ansFrmAbv.size(); j++){
                String combination = ansFrmAbv.get(j)+toAdd;
                ans.add(combination);
            }
        }
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
//        ArrayList<String> ans = OldPhone(2 , new int[] {2,5});
//        System.out.println(ans);

        System.out.println(GetKPC("1234"));
    }
}
