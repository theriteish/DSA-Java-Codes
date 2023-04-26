public class TowerOfHanoi {
    public static void main(String[] args) {

        //Three towers :- 1,2,3  (tower 3 -> auxiliary tower)
        //Discs are placed in ascending order in tower 1
        // we have to move discs from rod 1 to 2 with the help of 3.
        //first , we move n-1 disc from tower 1 to tower 3 .
        //then  move nth disc to tower 2.
        //then n-1 discs from tower 3 to tower 2.

        towerOfHanoi(3,1,2,3);


    }

    static void towerOfHanoi(int n, int a, int b, int c){
        //Base case:
        if(n==0){
            return;
        }
        //first , we move n-1 discs from tower 1 to tower 3:
        towerOfHanoi(n-1,a,c,b);
        System.out.println("move disc "+ n+ " from tower "+a+" to tower "+b);
        //now, we move back disc from tower 3 to 2:
        towerOfHanoi(n-1, c,b,a);
    }
}
