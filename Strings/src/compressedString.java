import java.util.Scanner;

public class compressedString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();

            String ans = compressedString(str);
            System.out.println(ans);

        }
    }
    static String compressedString(String s) {
        StringBuilder sb = new StringBuilder();
        int count =1;
        for(int i =0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                if(count>1){
                    sb.append(s.charAt(i));
                    sb.append(count);
                }
                else{
                    sb.append(s.charAt(i));
                }
                count=1;
            }
        }
        //for end character:
        if(count >1){
            sb.append(s.charAt(s.length()-1));
            sb.append(count);
        }else{
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}
