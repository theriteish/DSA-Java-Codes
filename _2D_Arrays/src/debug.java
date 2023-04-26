public class debug {
    public static void main(String[] args) {
//        String str = "0001100100";
//        int ans = removeZeros(str);
//        System.out.println(ans);

        int []arr = {2,2,1,3,3,4,4,5,5};
        int sol = singleNumber(arr,arr.length);
        System.out.println(sol);

    }
    static int singleNumber(int A[], int n) {
        int result = 0;
        for (int i = 0; i<n; i++)
        {
            result ^=A[i];
        }
        return result;
    }
    static int removeZeros(String s)
    {
        //Write your code here
        char [] ch = s.toCharArray();

        //removing starting zero:
        int id = 0;
        while(id<ch.length){
            if(ch[id] == '0'){
                id++;
            }else{
                break;
            }
        }
        //removing last zeros:
        int idx = ch.length-1;
        while(idx>=0){
            if(ch[idx] == '0'){
                idx--;
            }else{
                break;
            }
        }

        char [] digits = new char[idx-id+1];
        int count = 0, index = 0;
        while(id<=idx){
            digits[index] = ch[id];
            index++;
            id++;
        }
        for(int i=0; i<digits.length; i++){
            if(digits[i] == '0')count++;
        }
        return count;

    }
}
