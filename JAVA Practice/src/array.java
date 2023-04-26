import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//
       Scanner sc = new Scanner(System.in);
       char c;
        int largest =Integer.MIN_VALUE, smallest =Integer.MAX_VALUE;
       do{
           int n = sc.nextInt();
           largest = Math.max(largest,n);
           smallest = Math.min(smallest ,n);
            c = sc.next().charAt(0);
       }while(c!='N');

        System.out.println("Largest number: "+largest );
        System.out.println("Smallest number: "+ smallest);

    }
    static int sum2(int chacha, int bhatija){
        return chacha + bhatija;
    }
    static void sum(int a , int b){
        int sum = a+b;
        System.out.println(sum);
    }
    static void buildings(int []arr){
        int m = arr[0];
        int count =1;
        for(int i =1 ; i<arr.length; i++){
            if(arr[i]>m){
                m =arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
    static long cProduct(long []arr){
        long ans= 1;
        for(int i =0 ;i<arr.length; i++){
            ans *=arr[i];
        }
        return ans;
    }
    static void uniqueNo(long []arr){
        for(long i =0 ; i<arr.length ; i++){
            int count =1 ;
            for(long j =0 ; j<arr.length; j++){
                if(arr[(int) i]==arr[(int) j]&&i!=j){
                    count++;
                }
            }
            if(count ==1){
                System.out.println(arr[(int) i]);
                break;
            }
        }
    }
    static void secondOcc(int []arr , int key){
        int count =0;
        for(int i =arr.length-1; i>=0; i--){
            if(arr[i]==key){
                count ++;
                System.out.print(i);
                break;
            }
        }
        if(count ==0){
            System.out.print(-1);
        }
    }

    static void firstOcc(int []arr , int key){
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==key){
                count ++;
                System.out.print(i+" ");
                break;
            }
        }
        if(count ==0){
            System.out.print(-1+" ");
        }
    }
    static boolean checkDuplicates(int []arr){
        for(int i =0; i<arr.length; i++){
            int count =1;
            for(int j =0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                }
            }
            if(count >1){
                return true;
            }
        }
        return false;
    }
    static int num(int []arr){
        int ans =0;
        for(int i =0; i<arr.length; i++){
            ans = (ans*10 + arr[i]);
        }
        return ans;
    }
    static int vowels(String str){
        int count =0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                count++;
        }
        return count;
    }
    static void duplicateElements(int []arr , int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.print(i+" ");
                break;
            }
        }
        for(int i =arr.length-1; i>=0; i--){
            if(arr[i]==key){
                System.out.print(i);
                break;
            }
        }
    }
    static void reverse_(int []arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    static int loneElement(int []arr){
        for(int i =0; i<arr.length; i++){
            int count =0;
            for(int j =0; j<arr.length; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count ==1){
                return arr[i];
            }
        }
        return -1;
    }
    static void last(int []arr , int key){
        int id =0;
        boolean f =true;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key)
                id = i;
            f =false;
        }
        if(f==true){
            System.out.println(-1);
        }
        else{
            System.out.println(id);
        }
    }
    static String placeValue(int n){
        String s = Integer.toString(n);
        int id = s.length();
      if(s.charAt(id-2)=='0'){
       return"YES" ;
      }
      return "NO";
    }
    static int secondLargest(int []arr){
        int max = 0 , max2 = 0;
        max = max2 =Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i =0; i<arr.length; i++){
            if((arr[i]>max2 && arr[i]<max) ){
                max2 = arr[i];
            }
        }
        return max2;
    }

    static int max(int []arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = arr[0];
            }
        }
        return max;
    }
    static int min(int []arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    static int searchInRange(int []arr , int target, int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for(int index = start; index <=end; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    static void reverse(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
