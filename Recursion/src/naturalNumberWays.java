public class naturalNumberWays {
    public static void main(String[] args) {
        System.out.println(ways(4 , 1));
    }
    //current sum , count , n ,
    static int ways(int n, int i){
        if(n==0)return 1;
        if(n<0 || i>n) return 0;

        return ways(n-i, i+1) + ways(n, i+1);
    }
}
