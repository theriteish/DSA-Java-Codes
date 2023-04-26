package com.Ritesh.staticExample;

//Initialisation of static variables
public class StaticBloks {
    static int a =4;
    static int b;

    //This is a static block it runs only once , when the first obj is created i.e when the class is loaded for the first tym
    static {
        System.out.println("I am staticBlock");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBloks obj = new StaticBloks();
        System.out.println(StaticBloks.a +" " + StaticBloks.b);

        StaticBloks.b +=3;
        System.out.println(a +" " + b);

        StaticBloks obj2 = new StaticBloks();
        System.out.println(StaticBloks.a+" " + StaticBloks.b);


    }

}
