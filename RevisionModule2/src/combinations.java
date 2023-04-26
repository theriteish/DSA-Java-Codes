public class combinations {
    public static void main(String[] args) {
        printCombination("" , "abc");
    }
    static void printCombination(String p, String up){
        //Dice combination:
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //no. of iteration depends upon the length of unprocessed String:
        char ch = up.charAt(0);
        for(int i=0; i<up.length(); i++){
            printCombination(p+up.charAt(i), up.substring(1));
        }
    }
}
