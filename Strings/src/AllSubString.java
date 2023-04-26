import java.util.Scanner;

public class AllSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String []ans = Substrings(str);
        for(String s : ans){
            System.out.print(s+" ");
        }

    }
    static String [] Substrings(String s){
       int n = s.length();
        String [] ans = new String[n*(n+1)/2];
        int idx =0;
        for(int i =0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                ans[idx]=s.substring(i,j);
                idx++;
            }
        }
        return ans;
    }
}
