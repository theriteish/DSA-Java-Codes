import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationRet("", "abcd"));
    }
    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //no. of recursive calls depends upon the size of processed String:
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String prefix = p.substring(0,i);
            String suffix = p.substring(i,p.length());
            permutation(prefix+ch+suffix, up.substring(1));
        }
    }
    static ArrayList<String> permutationRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String prefix = p.substring(0,i);
            String suffix = p.substring(i,p.length());
            ans.addAll(permutationRet(prefix+ch+suffix,up.substring(1)));
        }
        return ans;
    }
}
