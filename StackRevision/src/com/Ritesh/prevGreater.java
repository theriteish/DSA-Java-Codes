package com.Ritesh;

import java.util.Arrays;
import java.util.Stack;

public class prevGreater {

    static int [] prevGreatest(int []arr){
        int n = arr.length;
        int []ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            int ele = arr[i];

            while(st.size()>0 && arr[st.peek()]<ele){
                ans[st.peek()] = ele;
                st.pop();
            }
            // I am also looking for my previous greater:
            st.push(i);
        }
        while(st.size()>0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {9,7,8,10,9,2};
        int [] ans = prevGreatest(arr);
        System.out.println(Arrays.toString(ans));
    }
}
