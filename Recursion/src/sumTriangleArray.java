import java.util.Arrays;

public class sumTriangleArray {
    public static void main(String[] args) {
        int [] arr  ={1, 2, 3, 4, 5 };
        printTriangle(arr);

    }
    //Function to generate special triangle:
    static void printTriangle(int [] arr){
        //Base case:
        if(arr.length < 1) return;

        // creating new array which contains the
        //sum of consecutive elements in
        // the array passes as parameter.
        int [] temp = new int [arr.length-1];
        for(int i =0; i<arr.length-1; i++){
            temp[i] = arr[i] + arr[i+1];
        }

        //Make a recursive call and pass
        //the newly created array
        printTriangle(temp);

        // print current array in the end so
        //that smaller arrays are printed first
        System.out.println(Arrays.toString(arr));
    }
}
