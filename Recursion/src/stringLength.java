import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = length(str);
        System.out.println(ans);
    }
    static int length(String s){
        if(s.equals(""))return 0;
        return length(s.substring(1)) +1;
    }
}
