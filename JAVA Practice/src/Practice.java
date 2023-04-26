import java.util.*;
public class Practice {
    static void pyramid(int a){
        for(int i = 1; i<=a; i++){
            //spaces:
            for(int j = 1; j<=a-i; j++){
                System.out.print(" ");
            }
            //stars:
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Diamond(int a){
        //1st half:
        int b = a/2;
        int c = b+1;
        for(int i = 1; i<=c; i++){
            //spaces:
            for(int j = 1; j<=c-i; j++){
                System.out.print(" ");
            }
            //stars:
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half:
        for(int i =b; i>=1;i--){
            //spaces:
            for (int j = 1; j <=c-i ; j++) {
                System.out.print(" ");
            }
            //stars:
            for(int j =1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        }



    public static void main(String[] args) {

      //  pyramid(8);
      // pyramid (5);
      //  Diamond(5);
       //print till odd:
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int count =1;
//        while(n%2==0){
//
//                count ++;
//                n = sc.nextInt();
//        }
//        System.out.println(count);


//        while(n!=0){
//            count ++;
//            n = sc.nextInt();
//
//        }
//        System.out.println(count);

//        char c = sc.next().charAt(0);
//
//        while(c!=){
//            count ++;
//            c = sc.next().charAt(0);
//        }
//        int i = 1;
//        while(i>0){
//            System.out.println("Hello World");
//        }
//        int n = sc.nextInt();
//        char c = 'A';
//        for(int i =1; i<=n; i++){
//            for(int j =1; j<=i; j++){
//                System.out.print(c);
//            }
//            System.out.println();
//            c++;
//        }

//
       // Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
//        int a = n/2+1;
     //  int b = n/2;
//        // 1st Half:
//        for(int i = 1; i<=a; i++){
//            //Stars:
//            for(int j =1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //2nd Half:
//        for(int i =b; i>=1;i--){
//            //stars
//            for(int j = 1; j<=b;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i =b; i>=1;i--){
//            //stars
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.println(isprime(n));
        

//

    }
    static Boolean isprime(int n){
       int count =0;
       for(int i =1; i<=n; i++){
            if(n%i == 0){
               count ++;
            }
        }
        return switch (count) {
            case 2 -> true;
            default -> false;
        };
    }
}
