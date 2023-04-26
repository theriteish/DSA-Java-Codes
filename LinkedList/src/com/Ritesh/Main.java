package com.Ritesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //   LL list = new LL();

//       DLL list = new DLL();
//       list.insertFirst(87);
//        list.insertFirst(89);
//        list.insertFirst(9);
//        list.insertFirst(90);
//        list.insertLast(99);
//        list.insert(99,65);
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(78);
//        list.insert(87);
//        list.insert(89);
//        list.display();
//        list.delete(78);
//        list.display();
//
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        int K = sc.nextInt();
        Node head = Solution.insert(list.head,K);
        Node curr = head;

        do{
            System.out.print(curr.data+" ");
            curr = curr.next;
        }while(curr!=head);

    }
}

class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}
class Solution {
    static Node insert(Node head,int k) {
        // Write your code here.
        Node node = new Node(k);

        Node curr = head;

        do{
            curr = curr.next;
        }while(curr!=head);

        curr.next = node;
        node.next = head;

        return head;
    }
}