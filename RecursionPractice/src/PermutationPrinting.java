public class PermutationPrinting {


    static void permutationPrint(String str , String asf){
        //Base cond:
        if(str.isEmpty()){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char toAdd = str.charAt(i);

            String leftPart = str.substring(0,i);
            String rightPart = str.substring(i+1,str.length());
            //string left so far:
            String lsf = leftPart+rightPart;
            permutationPrint(lsf,asf+toAdd);
        }
    }

    public static void main(String[] args) {
        permutationPrint("abc", "");
    }
}
