public class printNumbers {
   static void printNum(int n){
       if(n==0){
           return;
       }

       printNum(n-1);
       System.out.print(n+" ");
   }

    public static void main(String[] args) {
        printNum(5);
    }
}
