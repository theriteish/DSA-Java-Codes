package com.Ritesh.basics;

public class Student {
    String name;
    int age;
    int roll;
   public Student(){
       //default constructor
   }
   public Student(String name){
       this.name = name;
   }
   public Student(String name, int age){
       this(name);
       this.age = age;
   }
   public Student(String name,int age,int rollNo){
       this(name,age);
       this.roll = rollNo;
   }

    public static void main(String[] args) {
        Student s1 = new Student("Ritesh");
    }
}
