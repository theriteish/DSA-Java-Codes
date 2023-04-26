import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {
//        String name  ="Ritesh";
//        char target = 't';
//        System.out.println(search(name , target));

        int [] [] mat  ={ {1 , 58 , 98 , 65},
                {45 , 54 , 65, 58},
                {48 , 68 , 25 , 65},
                {45, 87, 68, 68}

         };
      //  int target = 87;
      //  int [] ans  = search2D(mat , target);
      //  System.out.println(Arrays.toString(ans));
//        for (int row = 0; row < ans.length ; row++) {
//            System.out.print(row+" ");
//        }
//        for(int a :ans){
//            System.out.print(a+" ");
//        }
        int maximum = max(mat);
        System.out.println(maximum);


    }


    static Boolean search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(int i =0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static int[] search2D(int [][] arr , int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col] ==target){
                    return new int[] {row , col};
                }
            }

        }
        return new int  []{-1 , -1};
    }
    static int max(int [][] arr ){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }

}
