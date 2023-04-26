public class PrintBtwXandY {
    static void printXY(int x , int y){
        if(x>y){
            return;
        }
        System.out.print(x+" ");
        printXY(x+1,y);
    }

    public static void main(String[] args) {
        printXY(15,15);
    }
}
