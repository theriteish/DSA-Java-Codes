package com.Ritesh.singleTon;

public class Singleton {
    //it is  a class which allow to create only one object;
    //its constructor shouldnt be allowed to be called
    //we keep its constructor as private:
    //private basically means it can be accessed in this class only
    private Singleton(){

    }

    //we will make one static variable and using that variable we will make a method:
    //in which the constructor will be called only once:

    //we created a static object inctance which is not dependent on the object of Singleton class
    // with the help of it we will make a method which will call a constructor:
    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether one object has been created or not:
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
