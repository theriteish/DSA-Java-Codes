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
