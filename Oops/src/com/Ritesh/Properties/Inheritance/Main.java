package com.Ritesh.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(3 , 8, 9);
//        Box box2 = new Box(box);


//        System.out.println(box.l);
//        System.out.println(box.w);
//        System.out.println(box.h);
//        System.out.println(box2.l);
//        System.out.println(box2.w);
//        System.out.println(box2.h);
//
//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l +""+ box3.weight);
//        BoxWeight box4 = new BoxWeight(3,4,5,6);


        //object of child class will be able to access the properties of base class:
        //but the object of base class will not be able to access the properties of child class


        //the reference variable pointing to class determines the nature of object which will be created:
        // here(line 31) an object of class Box will be created; not of BoxWeight
        //since BoxWeight can take 4 arguments , so you can initialize weight but cant access it;
        //conclusion :- so when a reference to a subclass object assign to a super class reference variable
        //you will have access to those parts of the objects which has been only defined in the super class
//
//        Box box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);

      //  (box5.weight)  * cant be accessed -> since box5 is an object of Box , so it cant access BoxWeight properties
        //Box is a super class and BoxWeight is a subclass so object of super class cant access to properties of subclass.
        //although weight is initialize in BoxWeight class not in Box class


        //there are many variables in both parent and child classes
        //you are given access to variables that are in the ref type i.e. BoxWeight
        //hence , you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        //but here, when the obj itself is of type parent class, how will you call  the constructor of child class
        //this is why error
    //    BoxWeight box6 = new Box(2,3,4);



        //Multilevel Inheritance:

//        BoxPrize box7 = new BoxPrize(8,9,5,7,8);
//        System.out.println(box7.l);
//        System.out.println(box7.weight);
//        System.out.println(box7.prize);


       // BoxWeight box8 = new BoxPrize(1,3,5,6,7);
        /*System.out.println(box8.prize);*/ // prize variable is not initialize in BoxWeight class
        //and box8 is an object of BoxWeight which is a super class to BoxPrize
        //so box8.prize will give error bcoz prize has not been initialize in the BoxWeight class.


//        BoxPrize box9 = new Box();
//        BoxPrize box10 = new BoxWeight();

        //Here BoxPrize is a subclass of both Box and BoxWeight:
        //it will create an object of Box & BoxWeight
        //and in both Box and BoxWeight variable prize has not been initialized so it will give error

        Box box3 = new Box();
        box3.greeting();
        //Static method is not dependent on object , so to use static method we just have to use class.method().
        // static methods are inherited
        //so there is no point in overriding them in child class bcoz the method in the parent class
        //will always run no matter from which object you call it.

        Box box = new BoxWeight();
        box.greeting(); //here overriding didnt take place bcoz greeting is a static method and there is no point in overriding static method in child class bcoz they will always run no matter from which object you call it.
        BoxWeight.greeting(); // -> here BoxWeight doesnot contain greeting method but it inherited from Box class

        //conclusion-> static method can be inherited but cannot be overridden
    }
}
