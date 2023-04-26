import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {6,7,8,9,54,54, 67, 8 , 3};
        int target = 54;
        ArrayList<Integer>ans = indexList(arr , target, 0, new ArrayList<>());
        System.out.println(search(arr , target , 0));
        System.out.println(findIndex(arr , target , 0));
        System.out.println(searchFrmEnd(arr , target , arr.length-1));
        System.out.println(ans);
        ArrayList<Integer> indexList = findAllIndex(arr , target, 0);
        System.out.println(indexList);

    }
    static boolean search(int []arr , int target , int index){
        if(index == arr.length) return false; // not found
        return arr[index] == target || search(arr ,target , index+1);
    }
    static int findIndex(int [] arr , int target , int index){
        if(index == arr.length) return -1;  // Not found.

        if(target == arr[index]){
            return index;
        }else{
           return findIndex(arr , target , index+1);
        }
    }
    //search from end:
    static int searchFrmEnd(int []arr , int target , int idx){
        if(idx == -1) return -1; //Notfound till 0 that means target not available:
        if(arr[idx] == target){
            return idx;
        }else{
            return searchFrmEnd(arr , target , idx-1);
        }
    }
    // Returning an Arraylist:
    static ArrayList<Integer> indexList(int [] arr , int target, int idx  , ArrayList<Integer>list){
        if(idx == arr.length -1) return list;

        if(target == arr[idx]){
            list.add(idx);
        }
        return indexList(arr , target, idx+1, list);
    }
    static ArrayList<Integer> findAllIndex(int []arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Base Condition:
        if(index == arr.length) return list;
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> IndexFromBelowCalls = findAllIndex(arr , target, index+1);
        list.addAll(IndexFromBelowCalls);
        return list;
    }
}
