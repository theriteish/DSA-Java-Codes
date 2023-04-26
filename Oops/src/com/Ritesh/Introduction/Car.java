package com.Ritesh.Introduction;

class Car {
    String ModelName;
    int Price;
    String color;

    void drive() {
        System.out.println("zoom zoom zoom");
    }

    //constructor:
    Car(String Name, int price, String color) {
        this.ModelName = Name;
        this.Price = price;
        this.color = color;
    }
}
