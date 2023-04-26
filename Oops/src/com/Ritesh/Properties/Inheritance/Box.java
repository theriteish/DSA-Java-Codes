package com.Ritesh.Properties.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    static void greeting(){
        System.out.println("hey i am in Box class. Greetings!");
    }

    //cube
    Box(double side){

        // super();-> object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    //copying object:
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
