package com.Ritesh.properties.Polymorphism;

 class Vehicle {
    String color;
    int seats;

    public void vehicleHonk(){
        System.out.println("Honking from vehicle class");
    }

}
class Car extends Vehicle {
    String name;
    int engine = 47;

    public void vehicleHonk(String name){
        System.out.println("Honking from the Car class ");
    }

}


public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.vehicleHonk();
    }
}
