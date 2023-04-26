public class permutation {
    public static void main(String[] args) {
        // permutation -> Number of ways in which we can rearrange it.
        //tota no of permutation -> n!
        // abc -> cba , bca , bac , cab , acb , abc

        String str = "abc";
        printPermutation("" , str);
    }
    static void printPermutation(String p , String up){
        // String p(processed)  -> blank String
        //String up(unprocessed) -> given String
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0 ,i);
            String s = p.substring(i, p.length());
            printPermutation(f + ch + s ,up.substring(1) );
        }
    }
    static long factorial(int n)
    {
        //Write your code here
        long m = n;
        return Factorial(m);

    }

     static long Factorial(long l) {
       if(l==1)return 1;
       return l*Factorial(l-1);
    }
    static int lastIndex(int A[],int T,int startIndex)
    {
        //Write your code here
        if(A[startIndex]==T)return startIndex;
        return lastIndex(A ,T, startIndex-1);
    }
}
