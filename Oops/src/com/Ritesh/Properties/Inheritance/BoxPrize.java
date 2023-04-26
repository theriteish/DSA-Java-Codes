package com.Ritesh.Properties.Inheritance;

//Multilevel Inheritance:

public class BoxPrize extends BoxWeight{
    double prize;

    BoxPrize(){
        super();
        this.prize = -1;
    }

    //here super will call the constructor of BoxWeight which takes two arguements:
    BoxPrize(double side ,double weight, double prize){
        super(side , weight);
        this.prize = prize;
    }
    BoxPrize(BoxPrize other){
        super(other);
        this.prize = other.prize;
    }
    public BoxPrize(double l, double h, double w, double weight, double prize) {
        super(l, h, w, weight);
        this.prize = prize;
    }
}
