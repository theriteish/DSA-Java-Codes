import java.util.Scanner;

public class shuffleString {
    public static void main(String[] args) {
//        8
//        acciojob
//        4 5 6 7 0 2 1 3
     //   oojbacci
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(shuffleString(arr , str));
    }
    public static String shuffleString(int[] indices, String s){
        char shuffle[] = new char [indices.length];
        for(int i =0; i<indices.length; i++){
            shuffle[indices[i]] = s.charAt(i);
        }
        return new String(shuffle);
    }
}
