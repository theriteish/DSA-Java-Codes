import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permutations("" , "abc");
        System.out.println(permutationsRet("" , "abc"));
        System.out.println(permutationsCount("" , "abc"));
    }
    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //number of recursive calls is equal to length of empty string+1:
        for(int i=0; i<=p.length(); i++){
            String prefix = p.substring(0,i);
            String suffix = p.substring(i ,p.length());
            permutations(prefix+ch+suffix , up.substring(1));
        }
    }
    //Returning an Arraylist of permutations:
    static ArrayList<String> permutationsRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String prefix = p.substring(0,i);
            String suffix = p.substring(i ,p.length());
            ArrayList<String> frmBeforeCalls = permutationsRet(prefix+ch+suffix ,up.substring(1));
            ans.addAll(frmBeforeCalls);
        }
        return ans;
    }
    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String prefix = p.substring(0,i);
            String sufix = p.substring(i , p.length());
            count = count + permutationsCount(prefix + ch + sufix ,up.substring(1));
        }
        return count;
    }
}
