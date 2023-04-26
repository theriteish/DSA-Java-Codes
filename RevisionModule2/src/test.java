import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());

        solve(str,n);
  //      System.out.println(isPrime(991));


    }

    public static boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2; i*i<=n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void solve(StringBuilder str,int n){
        // WRITE YOUR CODE HERE
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(isPrime(Integer.parseInt(str.substring(i,j))))
                count++;
            }
        }
        System.out.println(count);
    }

}
