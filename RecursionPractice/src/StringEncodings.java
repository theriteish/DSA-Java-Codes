public class StringEncodings {

    public static void stringEncodings(String str , String asf){

        //Base cond:
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0) == '0'){
            return ;
        }

        //taking first digit only :
        int firstDigit = str.charAt(0) - '0';
        char toAdd = (char)('a'+ firstDigit -1);
        stringEncodings(str.substring(1),asf+toAdd);

        //taking two digits:
        if(str.length()>=2){
            int firstTwoDigits = Integer.parseInt(str.substring(0,2));
            if (firstTwoDigits <= 26) {
                toAdd = (char)('a'+firstTwoDigits-1);
                stringEncodings(str.substring(2),asf+toAdd);
            }
        }
    }
    public static int countEncodings(String str) {
        //Base condition:
        if(str.length()==0){
            return 1;
        }
        if(str.charAt(0)=='0'){
            return 0;
        }

        //take one digit :
        int take1 = countEncodings(str.substring(1));
        //take two digit:
        int take2 = 0;
        if(str.length()>=2) {
            int firstTwoDigits = Integer.parseInt(str.substring(0,2));
            if(firstTwoDigits<=26)
            take2 = countEncodings(str.substring(2));
        }
        return take1+take2;

    }

    public static void main(String[] args) {
        stringEncodings("123456789","");
       int ans= countEncodings("123456789");
        System.out.println(ans);
    }
}
