package com.Ritesh.Introduction;
class Student {
    int rno ;
    String name ;
    float marks ;

    //Default Constructor-> contains default value
//    Student(){
//        this.rno = 54;
//        this.name = "com.Ritesh Raj";
//        this.marks = 78.6f;
//    }


    //calling a constructer from different constructor:
    //Internally : new Student(87,"Shubham:, 89.5f);
    Student(){
        this(87, "Shubham", 89.5f);
    }

    //Student saish = new Student(17, "Saish", 89.5f)
    // here this will be replaced with Saish
    Student(int roll, String studenNname , float marks){
        this.rno = roll;
        this.name = studenNname;
        this.marks = marks;
    }
    void greeting(){
        System.out.println("Hello! My name is " + name);
    }

    // copying elements of one object to another object.
    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rno = other.rno;
    }

}

public class Main {
    public static void main(String[] args) {

        //just declaring:
        Student ritesh;

        //when the student object is not initialize by default it is giving null value.
        Student[] students = new Student[5];
        //     System.out.println(Arrays.toString(students));

        Student one = new Student();

        System.out.println(one.name);
        System.out.println(one.rno);
        System.out.println(one.marks);

        one.greeting();

        one.name = "Ritesh";
        one.marks = 95.4f;
        one.rno = 2;

        System.out.println(one.name);
        System.out.println(one.rno);
        System.out.println(one.marks);

        one.greeting();

        Student two = new Student(65, "Harsh", 76.5f);
        System.out.println(two.marks);

        Student three = new Student(one);

        System.out.println(three.name);

        Student four = new Student();
        Student five = four;
        four.name = "khilada";
        System.out.println(five.name);

        //cant modify the marks because final keyword has been used:
        //always initialize while declaring
        final int marks = 89;

        final Student Ritesh = new Student();
        Ritesh.name = "othername";

        //when a non primitive is final, you cant  reassign it:
        //    com.Ritesh = new Student();


    }
}
