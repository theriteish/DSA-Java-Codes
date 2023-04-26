public class EuclideanAlgo {
    public static void main(String[] args) {
        int a = 7, b = 8;
        int ans = gcd(a , b);
        System.out.println(ans);
    }
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

}
