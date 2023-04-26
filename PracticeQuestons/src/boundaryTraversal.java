public class boundaryTraversal {
    public static void main(String[] args) {
        String str = "807654TES6";
       String ans =  phoneNumberDecoder(str);
        System.out.println(ans);
    }
    public static char ltrToInt(char c){
        if(c>='A'&& c<='C')return '2';
        if(c>='D'&& c<='F')return '3';
        if(c>='G'&& c<='I')return '4';
        if(c>='J'&& c<='L')return '5';
        if(c>='M'&& c<='O')return '6';
        if(c>='P'&& c<='S')return '7';
        if(c>='T'&& c<='V')return '8';
        if(c>='W'&& c<='Z')return '9';

        return '0';
    }
    public static String phoneNumberDecoder(String PhoneNumber){
        StringBuilder ans = new StringBuilder();
        ans.append("91-");
        for(int i =0; i< PhoneNumber.length(); i++){
            char c = PhoneNumber.charAt(i);
            if(c>='0'&& c<='9'){
                ans.append(c);
            }else{
                char ch = ltrToInt(c);
                ans.append(ch);
            }
            if(i==4)ans.append('-');
        }
        return ans.toString();
    }
}
