package com.Ritesh;

public class SpaceComplexity {
    public static void main(String[] args) {

        //space complexity is affected by data structures and not variables.
        //Space complexity comes when elements are stored collectively in data structure.
        //If you created a data structure of size n the space complexity will be O(n);

        //Data structures -> arrays, 2D arrays , ArrayList , LinkedList, stack, queue, trees, deque
        int a = 100; //space complexity -> O(1) , Time complexity -> O(1)

        int n =10 , m =10;
        int []arr = new int [n];  //space complexity -> O(N):- Here n elements are stored collectively in data structure so, space complexity - O(N);

        //operations = n;
        //time complexity =O(n);
        for(int i=0; i<n; i++){
            System.out.println("Name");
        }
        //Here no data structure created inside the loop
        //No. of elements = 1;
        //so constant space complexity :- O(1)


        //Matrices:
        int [][] mat = new int [n][n];
        //Number of elements = n*n;
        //space complexity = O(n*n);


        //Strings:
        String s = "......................."; // string is a sequence of characters , here we have n characters
        //number of elements = n;
        //space complexity = O(n);

        String [] str = new String[m];
        //Number of elements = m ; m is the number of strings in the array and for every string there is n characters element .
        //every word in string = n; we are assuming every word length as the max length word
        //if every word length is diff -> we will take n as max length among the words.
        //space complexity = O(m*n);

        String ss[][] = new String [m][m];
        //number of elements = m*m;
        //for every element there is 'n' character elements in a string;
        //every word in a string of length n then space complexity for each word is - O(n).
        //space complexity - O(n*m*m);

    }


}
