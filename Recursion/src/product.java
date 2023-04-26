import java.util.Arrays;

public class product {
    public static void main(String[] args) {
        int a= 5 , b =0;
        int ans = product(a,b);
        System.out.println(ans);
    }
    static int product(int a , int b){
        if(a<b){
            product(b ,a);
        }
        if(b!=0){
            return a + product(a , b-1);
        }else{
            return 0;
        }
    }
}
