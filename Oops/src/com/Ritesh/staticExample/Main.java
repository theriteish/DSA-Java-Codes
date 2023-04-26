package com.Ritesh.staticExample;

public class Main {
    public static void main(String[] args) {
        Human Ritesh = new Human(22 , "Ritesh", 1000, false);
        Human kunal = new Human(22 , "kunal", 1000, false);
        Human arpit = new Human(22 , "Arpit", 1000, false);

        System.out.println(kunal.population);
    }
    static void fun(){
        //you can only access nonstatic method in static method by creating an object of that class;
      Main obj = new Main();
      obj.greeting();
    }
    //we know that something which is not static , belongs to an object
    void greeting(){
    //    fun(); // we can have a static method in non static mtd
        System.out.println("Hello World");
    }

    //we know that all the nonstatic method will be called in the main itself
    //which is static so to run it an object of this instance will be created

    void fun2(){
        fun();
    }
}
