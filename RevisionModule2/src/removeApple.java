public class removeApple {
    public static void main(String[] args) {
        String str = "applekilodaapp";

        String ans = skipApple(str);
        System.out.println(ans);

    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        return str.charAt(0) + skipApple(str.substring(1));
    }
}
