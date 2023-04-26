public class removeA {
    public static void main(String[] args) {
        String str = "khiladaa";

        System.out.println(removeA(str));
        System.out.println(Aremoval("", str));

    }
    //we can do this in two ways :
    // 1st one while passing String in the parameter
    //2nd declaring string in the function itself.
    static String removeA(String s){
        //Base Condition:
        if(s.isEmpty()){
            return "";
        }
        String ans = "";
        if(s.charAt(0)!='a') ans+=s.charAt(0);
        return ans + removeA(s.substring(1));
    }
    static String Aremoval(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        if(up.charAt(0)!='a') {
           return Aremoval( p+up.charAt(0), up.substring(1));
        }
        return Aremoval(p , up.substring(1));
    }
}
