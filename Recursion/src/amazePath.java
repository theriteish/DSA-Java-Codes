import java.util.ArrayList;
import java.util.Collections;

public class amazePath {
    public static void main(String[] args) {
//        aMazePaths(3,3,"" , 0 , 0);
//        System.out.println(maze(3,3,0,0));
//        ArrayList<String> ans = getMazePaths(0,0,"", 3,3);
//        System.out.println(ans);
        printMazePaths(0,0,2,2,"");

    }
    static int maze(int n, int m, int i, int j){
        //Base Condition:
        if(i == n || j == m) return 0;
        if(i == n-1 && j == m-1) return 1;

        //we take left as horizontal path & right as vertical path ->> if we take horizontal path we will increase col , if we take vertical path we will increase row:

        return maze(n, m, i, j+1) + maze(n , m, i+1, j);

    }
    static ArrayList<String> result = new ArrayList<>();
    static void printMaze(int n, int m, String p , int i, int j){
        if(i == n || j == m){
            return;
        }
        if(i == n-1 && j == m-1) {
            System.out.println(p);
            return;
        }

        printMaze(n , m, p+"h" , i , j+1);
        printMaze(n , m, p+"v" , i+1 , j);

    }
   static void aMazePaths(int n, int m, String p, int i, int j){
        //Base Condition:
        if(i == n || j == m) return;
        if(i == n-1 && j == m-1){
            System.out.println(p);
            return;
        }

        //Recursive Call:
        aMazePaths(n , m , p+"h" , i , j+1);
        aMazePaths(n , m , p+"v" , i+1 , j);
    }

    public static ArrayList<String> getMazePath(int i , int j, int n, int m){
        //Base Cond:
        if(i>=n || j>=m){
            ArrayList<String>base =new ArrayList<>();
            return base;
        }
        if(i == n-1 && j == m-1){
            ArrayList<String>base =new ArrayList<>();
            base.add("");
            return base;
        }


        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> ansFrmAbv = getMazePath(i+1, j+1, n, m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "d1"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePath(i, j+1, n , m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "h1"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePath(i+1, j, n , m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "v1"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePath(i+2, j+2, n, m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "d2"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePath(i+2, j, n , m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "v2"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePath(i, j+2, n , m);
        for(int k=0; k<ansFrmAbv.size(); k++){
            String path = "h2"+ansFrmAbv.get(k);
            ans.add(path);
        }
        Collections.sort(ans);
        return ans;
    }

    public static ArrayList<String> getMazePaths(int i, int j, String p, int n, int m){
        //Base Cond:
        if(i>=n || j>=m){
            ArrayList<String>base =new ArrayList<>();
            return base;
        }
        if(i == n-1 && j == m-1){
            ArrayList<String>base =new ArrayList<>();
            base.add(p);
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> ansFrmAbv = getMazePaths(i+1, j+1, "d1"+p, n, m);
        ans.addAll(ansFrmAbv);
        ansFrmAbv =   getMazePaths(i, j+1, "h1"+p,n , m);
        ans.addAll(ansFrmAbv);
        ansFrmAbv =   getMazePaths(i+1, j, "v1"+p,n , m);
        ans.addAll(ansFrmAbv);
        ansFrmAbv =   getMazePaths(i+2, j+2, "d2"+p,n , m);
        ans.addAll(ansFrmAbv);
        ansFrmAbv =   getMazePaths(i+2, j, "v2"+p,n , m);
        ans.addAll(ansFrmAbv);
        ansFrmAbv =   getMazePaths(i, j+2, "h2"+p,n , m);
        ans.addAll(ansFrmAbv);

        Collections.sort(ans);
        return ans;

    }
    static void recurse(int x, int y, int n, int m, String path) {
        if (x == n && y == m) {
            result.add(path);
            return;
        }
        if (x > n || y > m) {
            return;
        }
        recurse(x + 1, y, n, m, path + "h1");
        recurse(x, y + 1, n, m, path + "v1");
        recurse(x + 2, y, n, m, path + "h2");
        recurse(x, y + 2, n, m, path + "v2");
        recurse(x + 1, y + 1, n, m, path + "d1");
        recurse(x + 2, y + 2, n, m, path + "d2");
    }
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        recurse(1, 1, n, m, "");
        return result;
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //Base condition:
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc == dc){
            System.out.println(psf);
        }

        printMazePaths(sr, sc+1, dr, dc, psf+"h1");
        printMazePaths(sr+1, sc, dr, dc, psf+"v1");
        printMazePaths(sr+1, sc+1, dr, dc, psf+"d1");
        printMazePaths(sr, sc+2, dr, dc, psf+"h2");
        printMazePaths(sr+2, sc, dr, dc, psf+"v2");
        printMazePaths(sr+2, sc+2, dr, dc, psf+"d2");

    }
}
