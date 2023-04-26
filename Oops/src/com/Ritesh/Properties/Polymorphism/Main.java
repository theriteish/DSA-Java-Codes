package com.Ritesh.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //Polymorphism -> Act of representing the same thing in multiple ways

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();


        circle.area();

       //type of reference variable as the parent class but the object type is of child class:
        //-> if we use final keyword in the parent class method then we will not be able to override it
        
        //Here every class has a method named "area" , so child class is overriding the method in the runtime
        // -> it is an example of method overriding.
        //->it is also known as upcasting
        //-> Java determines this by dynamic method dispatch int the run time


    }
}
