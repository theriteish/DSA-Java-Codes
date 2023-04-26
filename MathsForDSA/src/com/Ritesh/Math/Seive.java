package com.Ritesh.Math;

public class Seive {
    public static void main(String[] args) {

        int n = 40;
        // Initially all the elements of primes array will be false;
        //when we find the element false that means it is prime and its multiple will be nonPrime
        //then mark all its multiples as nonPrime
        boolean [] primes = new boolean[n+1]; // n+1 -> want to include all the indices till n
        sieve(n,primes);


    }

    //false in array means number is prime
    static void sieve(int n ,boolean [] primes){
        for(int i = 2; i*i <= n; i++){
            //here primes[2] is false initially, so we will make all its multiple nonPrime or ture.
            if(!primes[i]){
                //it is false that means :- number is prime
                for(int j = i*2; j<=n; j+=i){
                    // if the number is prime then its multiple is nonprime
                    primes[j] = true;
                }
            }
        }
        for(int i = 2; i <= n; i++ ){
            if(!primes[i]){
                System.out.print(i +" ");
            }
        }
    }
}
