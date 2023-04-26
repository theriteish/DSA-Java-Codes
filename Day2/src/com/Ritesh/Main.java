package com.Ritesh;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Declaring an ArrayLst:
        ArrayList<Integer> list = new ArrayList<>();
        //->here by default the size of the list will be 10.


        //Declaring an ArrayList with an initial size:
        ArrayList<Integer> lists = new ArrayList<>(5); // inside constructor we passed the size we wanted
        //here the size will be the given size 5.
        //if we want to add more than 5 elements -> it will make a new arrayList automatically and copy previous element into new one and leave some spaces and old will be deleted
        //calculation of newCapacity -> oldCapacity + oldCapacity>>1(oldCapacity/2) => means newCapacity is 150% of oldCapacity



        //method: add:- add elements in an ArrayList
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(8);

        //Print an ArrayList:
        System.out.println(list);

        //add at a particular index:
        //method:- add(index, element) -> add at an index.
        list.add(0,8);
        System.out.println(list);


        //get any index
        //method : get(index) -> gives element of that index.
        Integer a = list.get(4);
        System.out.println(a);


        //set an index to a value
        //method :- set(index,value) -> sets/update ArrayList index to the given value
        list.add(3,9);
        System.out.println(list);


        //to get the length
        //method:- size()-> gives the size of ArrayList.
        int size = list.size();
        System.out.println(size);

        //to remove any element
        //method :- remove(index) -> remove from the given index in ArrayList.
        list.remove(4);
        System.out.println(list);

        //sort a list
        Collections.sort(list);
        System.out.println(list);

        //loop around an ArrayList:
        //for loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //for-each loop
        for(var element : list){         //var can be used as a datatype or wrapper class
            System.out.print(element +" ");
        }
        System.out.println();


        //Hetrogenous obj in ArrayList
        ArrayList list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4.5f);
        list3.add("Ritesh");
        System.out.println(list3);
    }
}



