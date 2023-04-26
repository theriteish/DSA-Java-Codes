import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        String ans = findAutori(str);
        System.out.println(ans);
    }
    static String findAutori(String s){
        String [] arr = s.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<arr.length; i++){
            sb.append(arr[i].charAt(0));
        }
        return sb.toString();
    }
}
