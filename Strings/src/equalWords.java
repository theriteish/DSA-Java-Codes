public class equalWords {
    public static void main(String[] args) {

        String []word1 = {"ab", "c"};
        String []word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1 , word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i =0; i<word1.length; i++){
            sb1.append(word1[i]);
        }
        for(int i =0; i<word2.length; i++){
            sb2.append(word2[i]);
        }
        String wordOne = sb1.toString();
        String wordTwo = sb2.toString();


        if(wordOne.equals(wordTwo)){
            return true;
        }
        return false;
    }
}
