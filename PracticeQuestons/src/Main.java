public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 1;
        for(int i = 2; i>=0; i--){
            int d = n%2;
            n = n/2;
            System.out.print(d+" ");
        }
    }
}