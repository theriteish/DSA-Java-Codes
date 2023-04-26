import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class printStairsPath {
    public static void main(String[] args) {
        int n =2;
        String s = "";
        stairs(n , s);
        System.out.println(helper(3 , ""));
    }
    static void stairs(int n , String path){
        //Base Condition:
        if(n==0){
            System.out.println(path);
            return;
        }
        if(n<0)return;
        // Recursive Call:
        stairs(n-1, path+"1");
        stairs(n-2 , path+"2");
    //    stairs(n-3 , path+"3");
    }
    static ArrayList<String> helper(int n , String p){

        ArrayList<String> list = new ArrayList<>();
        //Base Condition:
        if(n==0){
           list.add(p);
           return list;
        }

        if(n<0) return list;

        ArrayList<String> path1 = helper(n-1,p+"1");
        ArrayList<String> path2 = helper(n-2,p+"2");
        ArrayList<String> path3 = helper(n-3,p+"3");
        path1.addAll(path2);
        path1.addAll(path3);
        return path1;
    }
}
