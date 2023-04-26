import java.util.Scanner;

public class ReverseStringWordwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String ans = reverseWord(str);
            System.out.println(ans);

        }
    }
    static String reverseWord(String s){
        String [] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();
    }

}
