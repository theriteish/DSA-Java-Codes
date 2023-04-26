public class Main {
    public static void main(String[] args) {
     //   print(1);
        greet(1);
    }
    static void print(int n){
        if(n==1024){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n*2);
    }
    static void greet(int count){
        if(count == 5)return;
        System.out.println("Hello World");
        count++;
        greet(count);
    }
}