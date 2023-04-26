public class ReverseWordWise {
    public static void main(String[] args) {
        String s = "Hello World     ";
        String ans = reverseWordWise(s);

        System.out.print(ans);

    }
    static String reverseWordWise(String s){
        String [] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=word.length-1; i++){
          if(!word[i].isEmpty()){
              sb.insert(0, word[i]);
              if(i<word.length-1)sb.insert(0 , " ");
          }
        }
        return sb.toString();
    }
}
