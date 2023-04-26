package com.Ritesh.staticExample;

import org.testng.annotations.Test;

//outside class cannot be static:->bcoz it shouldnt depend upon any other class
public class InnerClasses {

    //This class is dependent upon outer class:
    //Hence, thic class can be static 7 non static as well
    //if we create an inner class which is non static we have to create object of outer class first to access inner class:
    //so we have to make our inner class static so that it will be independent of object and we can use it inside main without creating an obj;

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        //we created an object of inner class
        //if the inner class is static then it is fine , if not static then it will give error :
        //to prevent error either we should make our inner class static

        Test a = new Test("Ritesh");
        Test b = new Test("Kshitiz");
        System.out.println(a.name);
        System.out.println(b.name);


    }
}
