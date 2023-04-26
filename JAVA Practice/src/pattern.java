import java.util.Scanner;

public class pattern {
    static void Diamond(int a){

        int b = a/2;
        int c = a/2+1;
    //    1st half:
        for(int i = 1; i<=c; i++){
            //spaces:
            for(int j = 1; j<=c-i; j++){
                System.out.print("  ");
            }
            //stars:
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       //  2nd half:
        for(int i =b; i>=1;i--){
            //spaces:
            for (int j = 1; j <=c-i ; j++) {
                System.out.print("  ");
            }
            //stars:
            for(int j =1; j<= 2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        //Outer Loop:
//        for(int i =1; i<=n; i++){
//            //for spaces:
//            int spaces = n-i;
//            for(int j =1; j<=spaces; j++){
//                System.out.print(" ");  //print one space in parantheses
//            }
//            //for hashes:
//            int hashes = i;
//            for(int j =1; j<=hashes; j++){
//                System.out.print("#");
//            }
//            System.out.println();
//        }
        Scanner input = new Scanner(System.in);

      //  System.out.print("Enter a number: ");
        int n = input.nextInt();

//        for (int x = 0; x <= n; x++) {
//            for (int y = n; y >= 1; y--) {
//                if (y > x) {
//                    System.out.print("* ");
//                }
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


       // zPattern(n);
//        int a = n/2 , b =n/2+1;
//        //1st Half:
//        for(int i =b; i>=1 ; i--){
//            //spaces:
//            for(int j =1 ; j<=b-i; j++){
//                System.out.print("  ");
//            }
//            //void stars:
//            for(int j = 1 ; j<=2*i-1; j++){
//                if(i ==b || j==1 || j==2*i-1){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        //2nd Half:
//        for(int i =1; i<=a ; i++){
//            //spaces:
//            for(int j =1 ; j<=a-i; j++){
//                System.out.print("  ");
//            }
//            //void stars:
//            for(int j = 1 ; j<=2*i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        Diamond(n);

    }
    static void zPattern(int n){
        for(int i =1; i<=n; i++){
                if(i==1 ||i==n) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                }
                else{
                    //spaces:
                    for(int j =1; j<=n-i;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
