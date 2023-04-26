import java.util.Scanner;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();  //just take enter as an input after entering the integer n;
        String str = sc.nextLine();
        String ans = toggleCharacters(str);
        System.out.println(ans);
    }

    static String toggleCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char) ('A' + s.charAt(i) - 'a'));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char) ('a' + s.charAt(i) - 'A'));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
