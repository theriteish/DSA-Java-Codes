package com.Ritesh;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

    // arr = {3,5,7,2,8,9}
    static int[] nextGrtr(int []arr){
        //inside st we are storing the index of element which is searching for its nge
        Stack<Integer> st = new Stack<>();
        int [] nge = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int ele = arr[i];

            while(st.size()>0 && arr[st.peek()]<ele){
                nge[st.peek()] = ele;
                st.pop();
            }

            st.push(i);
        }
        while(st.size()>0){
            nge[st.peek()] = -1;
            st.pop();
        }
        return nge;
    }

    public static void main(String[] args) {
        int []arr = {13,5,6,7,9,1,10};

        int []ans = nextGrtr(arr);
        System.out.println(Arrays.toString(ans));
    }
}
