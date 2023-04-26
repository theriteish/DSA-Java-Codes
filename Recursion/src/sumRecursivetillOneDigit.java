import java.util.Scanner;

public class sumRecursivetillOneDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // Your code here
        String ans = sortSentence(s);
        System.out.println(ans);
    }
    static int lastCharDigit(String s){
        char c = s.charAt(s.length()-1);
        return c-'0';
    }
    static String removeLast(String s){
        return s.substring(0,s.length()-1);
    }

    public static String sortSentence(String s) {

        String [] arr = s.split(" ");

        String [] ans = new String [arr.length];

        for(int i=0; i<arr.length; i++){
            int idx = lastCharDigit(arr[i]) - 1;
            ans[idx] = arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ans.length; i++){
            String str = removeLast(ans[i]);
            sb.append(str);
            if(i!=arr.length-1) sb.append(" ");
        }
        return sb.toString();

    }
    static int findAns(int n){
        int ans = sumDigitRec(n+1);
        if(ans == 1){
            return n+1;
        }else{
            return findAns(n+1);
        }
    }
    static int sumDigitRec(int n){
        //Base Condition:
        if(n>=0 && n<=9)return n;
        //Recursive Call:
        int k = sumDigits(n);
        return sumDigitRec(k);
    }
    static int sumDigits(int n){
        //Base Condition:
        if(n==0)return 0;
        //Recursive Call:
        return (n%10)*(n%10) + sumDigits(n/10);
    }
}
