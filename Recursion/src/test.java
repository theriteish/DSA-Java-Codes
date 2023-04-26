import java.util.Arrays;

public class test {
    public static void main(String[] args) {
//        countCharacter("HELLOritesh321");
//        int [] arr = {1,2,3,4,5};
//        minMax(arr, arr.length);
//        printPatter(4);
        int ans = odddigits(12468);
        System.out.println(ans);

    }
    static void countCharacter(String str){
        int countC = 0 , countS = 0 , countD = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch <= 'Z'){
                countC++;
            }
            if(ch>='a' && ch<= 'z'){
                countS++;
            }
            if(ch>='0' && ch<='9'){
                countD++;
            }
        }
        System.out.print(countC +" " + countS+" "+countD);
    }
    static void minMax(int []arr , int n){
        int ansMin = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i++){
            ansMin = Math.min(ansMin , arr[i+1]-arr[i]);
        }
        int ansMax = arr[n-1] - arr[0];
        System.out.println(ansMin +" "+ ansMax);
    }
    static void printPatter(int n){
        for(int i =1; i<=n; i++){
            //spaces:
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers:
            for(int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static int countVowel(String str){
        int count =0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        return count;
    }
    static int odddigits(int n){
        int ans = 0;
        while(n>0){
            int digit = n%10;
            if(digit % 2 == 1){
                ans+= digit;
            }
            n/=10;
        }
        return ans;
    }
}
