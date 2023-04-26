import java.util.Stack;

public class LargestHistogramArea {

    public static long maximumArea(long hist[], long n){
        //first we will find the possible width of the rectangular grid:
        //for finding the width we need prevSmaller & nextSmaller index
        // width = nextSmaller - prevSmaller -1;
        //Area = height*width;
        int [] left = prevSmaller(hist,n);
        int [] right = nextSmaller(hist,n);

        long [] width = new long[(int)n];
        for(int i=0; i<n; i++){
            width[i] = right[i] - left[i] - 1;
        }
        long max = 0;
        for(int i=0; i<n; i++){
            long area = hist[i]*width[i];
            max = Math.max(max,area);
        }
        return max;
    }

    static int []  nextSmaller(long []arr , long n){
        int length = (int)n;
        int []ans = new int[length];
        Stack<Integer> st  = new Stack<>();

        //we have to find next ele smaller thn curr
        //so we will traverse left to right:

        for(int i=0; i<n; i++){
            long ele = arr[i];
            while(st.size()>0 && arr[st.peek()]>ele){
                //it means ele is the next smaller number for the top ele of stack, so we will store the curr index corresponding to the top element idx of stack
                ans[st.peek()] = i;
                //since we updated the next smaller so we delete it from stack:
                st.pop();
            }
            //adding the current index in stack so that we can find its next smaller:
            st.push(i);
        }
        //if the elements are available in the stack that means it does not has any next smaller element:
        while(st.size()>0){
            ans[st.peek()] = (int)n;
            st.pop();
        }
        return ans;
    }

    static int [] prevSmaller(long []arr, long n){
        int length = (int)n;
        int ans[] = new int[length];
        Stack<Integer> st = new Stack<>();
        for(int i=length-1; i>=0; i--){
            long ele = arr[i];
            while(st.size()>0 && arr[st.peek()]>ele){
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }

        while(st.size()>0){
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }

    //optimized method:-> we will find the nextSmaller & prevSmaller in one pass with the help monotonic stack

    static long optMaximumArea(long[]arr, long size){
        int n = (int)size;
        Stack<Integer> st = new Stack<>();
        long max = 0;

        for(int i=0; i<n; i++){
            long ele = arr[i];
            while(st.size()>0 && arr[st.peek()]>ele){
                //we will get the next smaller ele index:
                int idx = st.peek();
                int nextSmaller = i;
                st.pop();
                //after deleting the ele from stack we will get prev smaller ele index:
                int prevSmaller = -1;
                if(st.size()>0){
                    prevSmaller = st.peek();
                }else{
                    prevSmaller = -1;
                }
                int width = nextSmaller - prevSmaller -1;
                long area = arr[idx]*width;
                max = Math.max(area,max);
            }
            st.push(i);
        }
        //for remaining index in stack:
        while(st.size()>0){
            int idx = st.peek();

            int nextSmaller = n;
            st.pop();
            int prevSmaller = -1;
            if(st.size()>0){
                prevSmaller = st.peek();
            }else{
                prevSmaller = -1;
            }
            int width = nextSmaller - prevSmaller -1;
            long area = arr[idx]*width;
            max = Math.max(area,max);
        }

        return max;
    }


    public static void main(String[] args) {
        long[]arr = {1,2,3,1};
        long ans  = optMaximumArea(arr,arr.length);
        System.out.println(ans);
    }
}
