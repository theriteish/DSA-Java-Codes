import java.util.Scanner;

public class shuffleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        String ans = shuffleString(str , arr);
        System.out.println(ans);
    }

    //return a shuffled string
    static String shuffleString(String s , int[]indices){
        char [] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            arr[indices[i]]=s.charAt(i);
        }
        for(char c :arr){
            sb.append(c);
        }
        return sb.toString();
    }
}
