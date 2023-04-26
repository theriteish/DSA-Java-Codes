package com.Ritesh.Properties.Polymorphism;

public class ObjectPrint {
    //Every class by default extends Object class.

    int num;

   public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString(){
       return "ObjectPrint{" +
               "num=" + num +
               '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        //until now we didnt make our own toString method
        //Here the object that we have passed doesnot have its own toString method , thats why it will use by default obj.toString().
       // System.out.println(obj); //here println method will be called of object class and it will give some hashcode value


        //now we made our own toString method
        System.out.println(obj);
    }
}
