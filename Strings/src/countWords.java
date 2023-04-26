import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.nextLine(); // just to take enter as the input so that we can take input of our strings properly
        while(t-->0){
            String str = sc.nextLine();
            int ans = countWords(str);
            System.out.println(ans);
        }

        }
        static int countWords(String s){
        String [] arr = s.split(" ");
        return arr.length;
        }
    }

