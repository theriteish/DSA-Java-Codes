import java.util.Scanner;

public class MaxFreqCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ans = maxFreq(str);
        System.out.println(ans);
    }
    static char maxFreq(String s){
        int [] arr = new int [26];
        for(int i =0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            arr[idx]++;
        }
        //finding the maximum among the array which gives the max freq:
        int max = 0;
        int maxFreq =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){    // (>) will take care of lexographically smaller thing
                max =arr[i];
                maxFreq =i;
            }
        }
        return (char)('a'+maxFreq);
    }
}
