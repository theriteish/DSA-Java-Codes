import java.util.ArrayList;

public class getStairPaths {

    public static ArrayList<String> getStairPaths(int n){
        //Base Condition:
        if(n<0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }


        ArrayList<String> ans = new ArrayList<>();

        //if we take a jump of 1:-
        ArrayList<String>ansFrmAbv = getStairPaths(n-1);
        for(int i=0; i<ansFrmAbv.size(); i++){
            String path = "1"+ ansFrmAbv.get(i);
            ans.add(path);
        }

        //if we take a jump of 2:-
         ansFrmAbv = getStairPaths(n-2);
        for(int i=0; i<ansFrmAbv.size(); i++){
            String path = "2"+ ansFrmAbv.get(i);
            ans.add(path);
        }

        //if we take a jump of 3:-
        ansFrmAbv = getStairPaths(n-3);
        for(int i=0; i<ansFrmAbv.size(); i++){
            String path = "3"+ ansFrmAbv.get(i);
            ans.add(path);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getStairPaths(3);
        System.out.println(ans);
    }
}
