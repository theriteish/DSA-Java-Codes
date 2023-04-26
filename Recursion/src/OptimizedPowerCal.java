public class OptimizedPowerCal {
    public static void main(String[] args) {

        long ans = powerRec(2,23);
        System.out.println(ans);
    }

    static long powerRec(int p, int q){
        //we have to calculate p raise to power q:

        //Base cond:
        if(q==0)return 1;

        long t = powerRec(p,q/2); //-> it is calculating p^q/2;

        if(q%2==0){
            //p^q/2 * p^q/2 -> p^q:
            return t*t;
        }else{
            //q is odd -> p^q/2*p^q/2*p will give the correct ans;
            return t*t*p;
        }

    }
}
