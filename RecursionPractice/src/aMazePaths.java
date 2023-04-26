import java.lang.reflect.Array;
import java.util.ArrayList;

public class aMazePaths {

    static ArrayList<String> getMazePaths(int i , int j , int n , int m){
        //Base cond:
        if(i>=n ||j>=m){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        if(i==n-1 && j == m-1){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> ansFrmAbv = getMazePaths(i, j+1, n,m);
        for(int k=0; k<ansFrmAbv.size(); k++ ){
            String path = "h"+ansFrmAbv.get(k);
            ans.add(path);
        }
        ansFrmAbv = getMazePaths(i+1, j, n,m);
        for(int k=0; k<ansFrmAbv.size(); k++ ){
            String path = "v"+ansFrmAbv.get(k);
            ans.add(path);
        }
        return ans;
    }
//    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
//        //Base condition:
//        if(sr>dr || sc>dc){
//            return;
//        }
//        if(sr==dr && sc == dc){
//            System.out.println(psf);
//        }
//
//        printMazePaths(sr, sc+1, dr, dc, psf+"h1");
//        printMazePaths(sr, sc+2, dr, dc, psf+"h2");
//        printMazePaths(sr+1, sc, dr, dc, psf+"v1");
//        printMazePaths(sr+2, sc, dr, dc, psf+"v2");
//        printMazePaths(sr+1, sc+1, dr, dc, psf+"d1");
//        printMazePaths(sr+2, sc+2, dr, dc, psf+"d2");
//
//    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //Base condition:
        // if(sr>dr || sc>dc){
        //     return;
        // }
        if(sr==dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int i=1; i<=dc-sc; i++){
            printMazePaths(sr,sc+i, dr, dc, psf+"h"+i);
        }
        for(int i=1; i<=dr-sr; i++){
            printMazePaths(sr+i,sc, dr, dc, psf+"v"+i);
        }
        for(int i=1; i<=dc-sc&&i<=dr-sr; i++){
            printMazePaths(sr+i,sc+i, dr, dc, psf+"d"+i);
        }
    }

    static int countMazePath(int i, int j, int n, int m){

        //Base Cond:
        if(i>=n || j>=m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }


        int hPaths = countMazePath(i,j+1, n,m);
        int vPaths = countMazePath(i+1, j, n,m);
        return hPaths+vPaths;
    }

    public static void main(String[] args) {
//        ArrayList<String> ans = getMazePaths(0,0, 2,3);
//        System.out.println(ans);
//        int sol = countMazePath(0,0,2,3);
//        System.out.println(sol);
        printMazePaths(0,0,2,2,"");
    }
}
