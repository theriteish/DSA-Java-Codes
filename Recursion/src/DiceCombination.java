public class DiceCombination {
    public static void main(String[] args) {
        diceCombination("", 6);
      //  int i=0 , j = s.length()-1;
    }
    static void diceCombination(String p , int target){
        // Base Condition:
        if(target==0){
            System.out.println(p);
            return;
        }
        //there cannot be more than 6 faces in a dice so it cannot exceed 6.
        for(int i=1; i<=target && i<=6; i++){
            diceCombination(p+i, target-i);
        }
    }

}
