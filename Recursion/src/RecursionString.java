public class RecursionString {
    public static void main(String[] args) {
        String str = "khiladaaa";
        //we have to skip the 'a':
        removeA("" , str);
       String ans =  removeA(str);
        System.out.println(ans);
        System.out.println(skipApple("kfdjappleskif"));

    }
    //String p (processed) -> empty String,
    //String ip(Unprocessed) -> original String;
    static void removeA(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            removeA(p, up.substring(1));
        }else{
            removeA(p+ch, up.substring(1) );
        }
    }

    static String removeA( String up){
        if(up.isEmpty()){
            return"";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return removeA(up.substring(1));
        }else{
           return ch+ removeA(up.substring(1) );
        }
    }

    static String skipApple( String up){
        if(up.isEmpty()){
            return"";
        }


        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) +skipApple(up.substring(1) );
        }
    }
}
