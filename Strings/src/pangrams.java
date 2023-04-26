import java.util.Scanner;

public class pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isPangram(str);
        System.out.println(ans);

    }
    static boolean isPangram(String s){
        s = s.toLowerCase();
        boolean [] checker = new boolean [26];
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
                int idx = s.charAt(i) - 'a';
                checker[idx] = true;
            }
        }
        for(int i =0; i<26; i++){
            if(checker[i]==false)
                return false;
        }
        return true;
    }
}
