import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ExtraBracket {

    public static boolean ExtraBrackets(String exp) {
        // Write your code here
        Stack<Character> st = new Stack<>();

        for(int i =0; i<exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch!=')'){
                st.push(ch);
            }else{
                if(st.peek() == '('){
                    return true;
                }else{
                    //it means it is a valid bracket:
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        return false;
    }

    public static void balancedBrackets(String s, int n) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch != ')' && ch!='}' && ch!=']'){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(st.size()>0 && st.peek() == '('){
                        st.pop();
                    }else{
                        System.out.print("NO");
                        return;
                    }
                }else if(ch == '}'){
                    if(st.size()>0 && st.peek() == '{'){
                        st.pop();
                    }else{
                        System.out.print("NO");
                        return;
                    }
                }else{
                    if(st.size()>0 && st.peek() == '['){
                        st.pop();
                    }else{
                        System.out.print("NO");
                        return;
                    }
                }
            }
        }
        if(st.size()>0){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }

    static boolean expBalanced(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch != ')' && ch!='}' && ch!=']'){
                st.push(ch);
            }else {
                while (st.size() > 0 && (st.peek() != '(' && st.peek() != '{' && st.peek() != '[')) {
                    st.pop();
                }
                if (st.size() > 0) {
                    if (ch == ')') {
                        if (st.size() > 0 && st.peek() != '(') {
                            return false;
                        } else {
                            st.pop();
                        }
                    } else if (ch == '}') {
                        if (st.size() > 0 && st.peek() != '{') {
                            return false;
                        } else {
                            st.pop();
                        }
                    } else {
                        if (st.size() > 0 && st.peek() != '[') {
                            return false;
                        } else {
                            st.pop();
                        }
                    }
                }
            }
        }
        if(st.size()>0)return false;
        return true;
    }
    public static boolean checkValidString(int n, String s){
        Stack<Character> st = new Stack<>();
        int count = 0;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '*')count++;

            if(ch!=')' && ch!='*' ){
                st.push(ch);
            }else{
                if(ch == ')'){
                    if(st.size() == 0)return false;
                    else st.pop();
                }
            }
        }
        if(st.size() == 0){
            return true;
        }else{
            if(st.size() == count){
                return true;
            }else{
                return false;
            }
        }
    }

    static int [] nextGreater(int []arr){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){

            if(st.size() == 0) {
                arr[i] = -1;
            }
            else {

            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//
//        boolean ans = ExtraBrackets(exp);
//
//        System.out.println(ans);

//        int []arr = {1,2,5,7,3,4,9,6,4};
//        int [] ans = nextGreater(arr);
//        System.out.println(Arrays.toString(ans));


     //   balancedBrackets("()]" ,3);
        boolean ans = checkValidString(5,")()(*");
        System.out.println(ans);

    }
}
