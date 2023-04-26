import java.util.Scanner;

public class practiceFunction {
    public static void printAverage(int a,int b,int c){
        System.out.println((a+b+c)/3);
    }
    public static void printOddSum(int n){
        int sum =0;
        for(int i =1; i<=n; i=i+2){
            sum +=i;
        }
        System.out.println(sum);
    }
    public static int maxValue(int a , int b){
        int max = Math.max(a,b);
        return max;
    }
//    public static double circumference(int r){
//       double c= 2*Math.PI*r;
//       return c;
//    }
//    public static String voter(int a){
//        if(a>=18){
//            return "yes";
//        }
//        else{
//            return "No";
//        }
//    }
    public static void power(int a,int b){
        long power = 1;
        for(int i =1; i<=b; i++){
            power *=a;
        }
        System.out.println(power);
    }
    public static void GCD(int a,int b){
        int min = Math.min(a,b);
        int GCD = 1;
        for(int i =1; i<=min; i++){
            if(a%i==0 && b%i==0){
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
    public static void fibonaciSeries(int n){
        int a =0;
        int b =1;
        for(int i =0;i<=n; i++){

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c =sc.nextInt();
//        printAverage(a,b,c);
//        int n = sc.nextInt();
//        printOddSum(n);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(maxValue(a,b));

//        int r = sc.nextInt();
//        System.out.println((int)circumference(r));

//        int n = sc.nextInt();
//        System.out.println(voter(n));

//        int n =1;
//        do{
//            System.out.println(5);
//        }while(n>0);

//        Scanner console = new Scanner(System.in);
//
//        int number, countPositive = 0, countNegative = 0, countZero = 0; char choice; do {
//
//            System.out.print("Enter the number ");
//
//            number = console.nextInt();
//
//            if(number > 0) { countPositive++; } else if(number < 0) { countNegative++; } else { countZero++; }
//
//            System.out.print("Do you want to continue y/n? ");
//
//            choice = console.next().charAt(0);
//
//        }while(choice=='y' || choice == 'Y');
//
//        System.out.println("Positive numbers: " + countPositive);
//
//        System.out.println("Negative numbers: " + countNegative);
//
//        System.out.println("Zero numbers: " + countZero);


//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        power(x,n);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        GCD(a,b);

//        char ch = 'E';
//        int n = (int)(ch-'A'+1);
//        System.out.println(n);


//        String name = "RITESH RAJ";
//        int n = name.length();
//        for(int i = n-1; i>=0; i--){
//            System.out.print(name.charAt(i));
//        }
        int a = sc.nextInt();
     //  int b =sc.nextInt();
   //    int c = sc.nextInt();
//        max(a,b,c);
//        min(a,b,c);
   //     oddEven(a);
   //     voter(a);

   //     sum(a,b);
       // product(a,b);

    //    circumference(a);

       // System.out.println(isPrime(a));
      //  grades(a);
     //   Factorial(a);
     //   System.out.println(palindrome(a));

      //  System.out.println(pythagoreanTriplet(a,b,c));
//        for(int i = a; i<=b; i++){
//            if(isPrime(i)){
//                System.out.print(i +" ");
//            }
//        }
      //  System.out.println(sumOfNumbersTillN(a));

   //     AreaCircle(a);
     //   AreaTriangle(a,b);

        int [] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        game(arr);


    }

    public static void game(int []arr){
        int n = arr.length;
        int flag =0;
        for(int i =0; i<n-1; i++){
            if(arr[i+1]==10*arr[i]){
                flag++;
                System.out.println("true");
            }
        }
        if(flag==0)
            System.out.println("false");
    }



    static void AreaTriangle(int b, int h){
        double area = (double)(b*h)/2;
        System.out.println(area);
    }

    static void AreaCircle(int n){
        double area = Math.PI*n*n;
        System.out.println(area);
    }


    static int sumOfNumbersTillN(int n){
        int sum = 0;
        for(int i =1; i<=n; i++){
            sum +=i;
        }
        return sum;
    }


    static Boolean pythagoreanTriplet(int a, int b, int c){
        return a * a == ((b * b) + (c * c)) || (b * b) == ((c * c) + (a * a)) || (c * c) == (b * b) + (a * a);
    }

    static Boolean palindrome(int n){
        int rev = 0;
        int temp= n;
        while(n>0){
            int digit = n%10;
            rev = rev*10+ digit;
            n =n/10;
        }
        return temp == rev;
    }


    static void max(int a, int b, int c){
        System.out.println(Math.max(Math.max(b,c),a));
    }
    static void min(int a, int b, int c){
        System.out.println(Math.min(Math.min(b,c),a));
    }
    static void oddEven(int n){
        if(n%2==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    static void voter(int n ){
        if(n>=18){
            System.out.println("Elligible");
        }
        else{
            System.out.println("Not elligible");
        }
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void product(int a, int b){
        System.out.println(a*b);
    }
    static void circumference(int r){
        int  c =(int)(2*Math.PI*r);
        System.out.println(c);
    }
    static Boolean isPrime(int n ){
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                count++;
            }
        }
        return switch (count) {
            case 2 -> true;
            default -> false;
        };
    }
    static void grades(int n){
        if(n>90){
            System.out.println("AA");
        }
        else if(n>80){
            System.out.println("BB");
        }
        else if(n>70){
            System.out.println("CC");
        }
        else if(n>60){
            System.out.println("BC");
        }
        else if(n>50){
            System.out.println("CD");
        }
        else if(n>40){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");
        }
    }
    static void Factorial(int n){
        int f =1;
        for(int i =1; i<=n; i++){
            f *=i;
        }
        System.out.println(f);
    }

}
