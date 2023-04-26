package com.Ritesh.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    static long population;

    static void message(){
        System.out.println("Hello World");
    //    System.out.println(this.age); // cant use this over here bcoz this keyword refers to object and static are independent of objects
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }
}
