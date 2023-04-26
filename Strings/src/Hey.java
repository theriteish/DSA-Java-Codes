import java.util.Scanner;

public class Hey {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String ans = Hey(str);
        System.out.println(ans);

    }
    static String Hey(String s){
        int eCount = s.length() - 2;
        int doubleE = 2*eCount;
        StringBuilder sb = new StringBuilder();
        sb.append('h');
        for(int i =0; i<doubleE;i++){
            sb.append('e');
        }
        sb.append('y');
        return sb.toString();
    }
}
