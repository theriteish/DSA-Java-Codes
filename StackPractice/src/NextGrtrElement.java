import java.util.Arrays;
import java.util.Stack;

public class NextGrtrElement {

    //arr = {2,4,7,8,9,10}
    static int [] nextGreater(int []arr){
        int n = arr.length;
        //we will take an array in which we will store the next greater elements :
        int [] ans = new int [n];

        //we will take a stack in which we will store the possible next greater elements:
        Stack<Integer> st = new Stack<>();

        //since we need next greater elements on right side that's why we are traversing it from right:
        for(int i=n-1; i>=0; i--){
            //if stack is carrying any possible greater elements , then it should be greater than the current element
            //if not greater, then pop elements from stack until we get element greater than current
            while (st.size()>0 &&st.peek() <= arr[i] ) {
                st.pop();
            }


            //if stack size is zero that means , we do not have any possible greater elements
            if(st.size() == 0) {
                ans[i] = -1;
            }
            //if stack has possible greater elements & if the top element of stack is greater than current element then store it as our next greater ele for curr ele.
            else {
                ans[i] = st.peek();
            }
            //every time we will add the current element as possible next greater elements for other elements.
            st.push(arr[i]);
        }
        return ans;
    }


    // arr = {1,4,2,6,5,8,9}
    //Monotonic stack solution:
    static int [] nge(int []arr){
        int n = arr.length;
        int ngr [] = new int [n];

        //This is a monotonic solution because all the elements in the stack is in decreasing order.
        //for monotonic , the stack should be either increasing or decreasing

        //in st we will store the index of ele which is looking for ngr
        Stack<Integer> st = new Stack<>();

        //traverse from left to right
        //because I want to create a pool of people looking for nge
        for(int i=0; i<n; i++){
            int ele = arr[i];

            //I can be a nge
            //go and see in pool , who all are interested
            while(st.size()>0 && arr[st.peek()]<ele){
                ngr[st.peek()] = ele;
                st.pop();
            }
            //I am also looking for my nge
            st.push(i);
        }

        //people looking for nge , will have it as -1:
        while(st.size()>0){
            ngr[st.peek()] = -1;
            st.pop();
        }


        return ngr;
    }
    public static long[] prevGreater(long[] arr, int n)
    {
        //we will create an array which will store the previous greater element:
        long [] ans = new long[n];

        //we will create a stack in which we will store the element for which we have to find previous greater element:
        Stack<Integer> st = new Stack<>();

        //we will traverse from left to right:
        for(int i=n-1; i>=0; i--){
            long ele = arr[i];

            while(st.size()>0 && st.peek()<ele){
                //this means ele can be next greater ele for the top element of stack:
                ans[st.peek()] = ele;
                //st.peek() index got its greater ele so we will delete it froms stack:
                st.pop();
            }

            //we also have to find the nge of ele , so we will add the curr index to stack
            st.push(i);
        }

        //Now if we have elements remaing in the stack that means their
        // next greater doesnt exists , so put -1 as their nge
        while(st.size()>0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        long []arr = {1,2,5,7,3,4,9,6,4};
        long [] ans = prevGreater(arr , arr.length);
        System.out.println(Arrays.toString(ans));
    }
}

