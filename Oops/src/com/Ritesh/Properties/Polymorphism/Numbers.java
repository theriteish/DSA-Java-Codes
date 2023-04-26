package com.Ritesh.Properties.Polymorphism;

public class Numbers {
    //MTD overloading:
    int sum(int   a, int b){
        return a+b;
    }
    int sum (int a  , int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2,5); // here at compile time , it is checked that this method takes 2 arguements
        obj.sum(2,3,6); // here at compile time , it is checked that this method is taking 3 arguements
        //Hence complie time PolyMorphism


    }
}
