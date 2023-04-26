package com.Ritesh;

import java.util.Scanner;

public class Node {
    int data;
    Node next;

    public Node(){

    }
    public Node(int data){

        this.data = data;
    }
    //Here head and tail represent first and last node of a LinkedList
    static Node head ;
    static Node tail;

    //This function is created to add value in the last of a LinkedList
    public static void addLast(int value){
        Node nn = new Node(value);

        //if we do not have any value in the linkedList -> then head will be null
        //and we add our first Node then head and tail will point to same Node
        if(head == null){
            head = nn;
            tail = nn;
        }else{
            //it means prior nodes are available in the LinkedList
            //we can access the last next Node by tail.next -> bcoz tail represent the last node
            // and we have to update previous next Node as current Node add
            //in the last tail will also denote to curr Node add
            tail.next = nn;
            tail = nn;
        }
    }
    public static void addFirst(int value){
        Node n = new Node(value);
        if(head == null){
            head = n;
            tail = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }

    public static int size(){
        Node curr = head;
        int count =0;
        while(curr != null){
            count ++;
            curr = curr.next;
        }
        return count;
    }

    public static void removeFirst(){
        if(head == null){
            System.out.println("LinkedList is empty, not possible to remove first");
        }else if(head == tail){
            //in this condition we only have one node:- both points to same node
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
    }

    public static void removeLast(){
        if(head == null){
            return;
        }else if(head == tail) {
            head = null;
            tail = null;
        }
        else{
            Node prev = getNode(size()-2);
            prev.next = null;
            tail = prev;
        }
    }

    public static int getAt(int index){
        int i = 0 , value = 0;
        Node curr = head;
        if(index>=size()){
            return -1;
        }
        while(i<=index){
            value = curr.data;
            curr = curr.next;
            i++;
        }
        return value;
    }
    public static Node getNode(int idx){
        int length = size();
        if(idx<0 || idx>= length){
            System.out.println("No such index exist");
            return null;
        }

        Node curr = head;
        for(int i=0; i<idx; i++){
            curr = curr.next;
        }
        return curr;
    }

    //add node at given index:
    public static void addAt(int idx , int value){
          if(idx<0 || idx>=size()){
              System.out.println("No such element exists");
              return;
          }

          if(idx == 0){
              addFirst(value);
          }else if(idx == size()){
              addLast(value);
          }else{
              Node n = new Node(value);
              Node prev = getNode(idx-1);
              Node next = prev.next; //it will be either getNode(idx) or prev.next-> bcoz we have to insert between these two nodes.
              prev.next = n;
              n.next = next;
          }
    }

    //remove at given index:
    public static void removeAt(int idx){
        if(idx<0 || idx>=size()){
            System.out.println("No such element exists");
            return;
        }

        if(idx == 0){
            removeFirst();
        }else if(idx == size()-1){
            removeLast();
        }else{
            Node prevNode = getNode(idx - 1);
            Node nextNode = getNode(idx+1);
            prevNode.next = nextNode;
        }

    }

    public static void printLinkedList(){
        Node curr = head; //we make a copy of head so that our head won't get updated

        while(curr !=null){
            System.out.print(curr.data);
            if(curr !=tail){
                System.out.print(" -> ");
            }
            Node nextNode = curr.next;
            curr = nextNode; //updating the curr Node after printing
        }
        System.out.println();
    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            //saving the next node for updating it to curr:
            Node nextOfCurr = curr.next;
            //reversing connection:
            curr.next = prev ;

            //move forward: -> updating for every node.
            prev = curr;
            curr = nextOfCurr;
        }
        //our head should become tail;
        tail = head;
        //our head should come at the last -> is equal to prev.
        head = prev;
    }



    public static void main(String[] args) {

        head = null;
        tail = null;
//        Node n1 = new Node();
//        n1.data = 11;
//
//        Node n2 = new Node();
//        n2.data = 54;
//
//        n1.next = n2;
//
//        Node n3 = new Node();
//        n3.data = 65;
//
//        n2.next = n3;
//
//        printLinkedList(n1);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int input = sc.nextInt();
            addLast(input);
        }

//        addLast(5);
//        addLast(7);
//        addFirst(6);
       // removeLast();
       // System.out.println(size());

       // System.out.println(getAt(5));
        printLinkedList();

       // addAt(3,6);
       // removeLast();
        reverse();
        printLinkedList();

    }
}
