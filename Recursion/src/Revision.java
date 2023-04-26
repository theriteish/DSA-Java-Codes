import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        System.out.println(toggle("HELLOabc"));
        String str = "Hello my name   is Ritesh  ";
        System.out.println(reverseWordWise(str));
        System.out.println(str);
        String s = "aaabbbbcccd";
        System.out.println(compressed(s));
        int [] arr = {0,0,1,1,0,0,1,0,1, 2,1,2,1,2};
      //  Sorting01(arr);
        System.out.println(Arrays.toString(arr));
        sorting012(arr);
        System.out.println(Arrays.toString(arr));

    }
    static String toggle(String str){
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch <='z'){
                char c = (char)('A' + ch -'a');
                ans.append(c);
            }else if(ch >='A' && ch <='Z'){
                char s = (char)('a'+ ch -'A');
                ans.append(s);
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    static String reverseWordWise(String str){
        String [] splitted = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<splitted.length; i++){
            if(!splitted[i].isEmpty()){
                ans.insert(0,splitted[i]);
                if(i!=splitted.length -1){
                    ans.insert(0,' ');
                }
            }

        }
        return ans.toString();
    }
    static String compressed(String str){
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count ++;
            }else{
                if(count >1){
                    ans.append(str.charAt(i));
                    ans.append(count);
                }else{
                    ans.append(str.charAt(i));
                }
                count =1;
            }
        }
        if(count >1){
            ans.append(str.charAt(str.length()-1));
            ans.append(count);
        }else{
            ans.append(str.charAt(str.length()-1));
        }
        return ans.toString();
    }
    static void Sorting01(int arr[]){
        int i = 0;
        int j =0;
        while(i<arr.length-1){
            if(arr[i] == 1){
                i++;
            }else if(arr[i] == 0){
                swap(arr , i , j);
                i++;
                j++;
            }
        }
    }
    static void swap(int []arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sorting012(int []arr){
        int i =0;
        int j =0;
        int k = arr.length-1;
        while(i<=k){
            if(arr[i] == 1){
                i++;
            }else if(arr[i] == 0){
                swap(arr , i, j);
                i++;
                j++;
            }else{
                swap(arr , i, k);
                k--;
            }
        }
    }

}
