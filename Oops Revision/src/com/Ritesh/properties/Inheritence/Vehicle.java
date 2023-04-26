package com.Ritesh.properties.Inheritence;

public class Vehicle {
    String color;
    int seats;
    public Vehicle(){

    }
    public Vehicle(String color, int seats){
        this.color = color;
        this.seats = seats;
    }
    public void vehicleHonk(){
        System.out.println("Honking from vehicle class");
    }

}
class Car extends Vehicle{
    String name;
    int engine = 47;
    public Car(){

    }
    public Car(String color, int seats, String name){
        super(color,seats); // parent constructor is called using super keyword
        this.name = name;
    }
    public void vehicleHonk(){
        System.out.println("Honking from the Car class but vehicle");
    }
    public void carHonk(){
        System.out.println("Honking from the car !!!");
        super.vehicleHonk();
    }
    public void doSomething(int engine){
        this.engine++;
    }
    public void doSomethingAgain(int seats){
        super.seats++;
    }
}
class Hyundai extends Car{
    String model;
    public Hyundai(){

    }
    public Hyundai(String color, int seats, String name, String model){
        super(color,seats,name);
        this.model = model;
    }
    public void honkHonk(){
        super.vehicleHonk();
    }

}

 class Solution{
     public static void main(String[] args) {
//         Car c1 = new Car();
//    //    c1.carHonk();
//        c1.seats = 4;
//        c1.doSomething(56);
//        c1.doSomethingAgain(45);
//         System.out.println(c1.engine);
//         System.out.println(c1.seats);
         Hyundai c1 = new Hyundai();
         c1.honkHonk();

         }
}
