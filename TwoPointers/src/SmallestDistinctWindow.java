public class SmallestDistinctWindow {
    public static int findSubString( String str) {
        int n=str.length();

        int min=n;

        // count the total unique words in letter

        boolean c[]=new boolean[126];

        //count of unique characters->t
        int t=0;

        //this loop id for finding the no. of unique characters first:
        for(int i=0;i<n;i++){

            if(c[str.charAt(i)] == false) t++;

            c[str.charAt(i)]=true;

        }

        // store count of letters

        int ch[]=new int[256];

        // use two pointers

        int j=0;

        int i=0;

        // temp count of unique words in slide window

        int count=0;

        while(j<n){


            // if starting word of window occures more than one then increment start point

            while(ch[str.charAt(i)]>1){
                ch[str.charAt(i)]--;
                i++;
            }



            // if temp count of unique character contain all unique chars then check for minimum

            if(count==t) min=Math.min(min,j-i);


            // for increment unique character count

            if(ch[str.charAt(j)]==0) count++;


            // inc ith char count

            ch[str.charAt(j)]++;
            j++;
        }



        // if first word in slide is repeted then inc start of slide

        while(ch[str.charAt(i)]>1) {
            ch[str.charAt(i)]--;
            i++;
        }

        // again check for min

        if(count==t) min=Math.min(min,j-i);


        // return min

        return min;
    }

    public static void main(String[] args) {

        int ans = findSubString("AABBBCBBAC");
        System.out.println(ans);
    }
}
