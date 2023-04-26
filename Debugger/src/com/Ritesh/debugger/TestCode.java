package com.Ritesh.debugger;

import java.util.List;
import java.util.Scanner;

public class TestCode {

    //9520
    static boolean luckyNumber(int n){
        int temp = n;
        int ans = -1;
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum +=digit;
            if(digit<sum){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public static String removeChars(String s) {
        // Write your code here
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='a' || ch =='c' || ch=='i' || ch=='o'){
                sb.append("");
            }
              else{
                  sb.append(ch);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
//        boolean ans = luckyNumber(9520);
//        System.out.println(ans);

//       boolean sol= "abc".contains("cabd");
//        System.out.println(sol);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int temp = n;
//        int sum = 0;
//        while(temp>0){
//            int digit = temp%10;
//            sum= (10*sum) + digit;
//            temp/= 10;
//        }
//        if(sum == n){
//            System.out.print(true);
//        }else{
//            System.out.print(false);
//
//        }
        System.out.println(removeChars("You will get placed soon."));
    }
}
