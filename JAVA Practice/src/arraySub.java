import java.util.ArrayList;
import java.util.Arrays;

public class arraySub {
    public static void main(String[] args) {
        int [] a = {9, 9};
        int [] b = {1,0,1};
        System.out.println(Arrays.toString(arrSub(a,b)));

    }
    static int [] arrSub(int []a, int []b){
        ArrayList<Integer> sub = new ArrayList<>();
        int borrow = 0;
        int i = a.length-1;
        int j = b.length-1;
        int k = a.length>b.length?a.length-1:b.length-1;
        while(k>=0){
            int digit = borrow;
            if(i>=0){
                digit+=a[i];
            }
            if(j>=0){
                digit-= b[j];
            }
            if(digit<0){
                digit+=10;
                borrow =-1;
            }else{
                borrow = 0;
            }
            if(digit!=0)sub.add(0,digit);
            i--;
            j--;
            k--;
        }
        int []ans = new int[sub.size()];
        for(int z=0; z<ans.length; z++){
            ans[z] = sub.get(z).intValue();
        }
        return ans;
    }
}
