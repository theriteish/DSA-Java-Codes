package com.Ritesh.Properties.Inheritance;

//we will use extends keyword to inherit the properties of Box class
public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        super(); // either we can call default constructor or we can leave it bcoz default constructor will be called automatically
        this.weight = -1;
    }
//    @Override // -> we cannot override static method().
//    static void greeting(){
//        System.out.println("hey i am in BoxWeight class. Greetings!");
//    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    //here super will call the constructor of Box class which takes one arguement:
    BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //super-> it is calling the parent class constructor
        //used to initialise parent class constructor.
        //when super is not used to call the parent constructor, then the default parent constructor will be called automatically
        //it will not be able to access the private members of parent class
        this.weight = weight;

       //when both parent and child have same properties/data member name
        //then to access the member of parent class you have to use "super" keyword
        //Example:-
       // System.out.println(super.weight); // here super.weight will refer to member of Box class
    }
}
