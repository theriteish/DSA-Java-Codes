import java.util.LinkedList;
import java.util.Scanner;

class Solution {
   static LinkedListNode<Integer> sort01(LinkedListNode<Integer> head){
        //Write your code here
       LinkedListNode<Integer> curr = head;
       LinkedListNode<Integer> d0 = new LinkedListNode<>(-1);
       LinkedListNode<Integer>d1 = new LinkedListNode<>(-1);
       LinkedListNode<Integer> t0 = d0;
       LinkedListNode<Integer>t1 = d1;

       while(curr!=null){
           if(curr.data == 0){
               t0.next = curr;
               t0 = t0.next;
           }else{
               t1.next = curr;
               t1 = t1.next;
           }
           curr = curr.next;
       }
       t0.next = d1.next;
       t1.next = null;
       return d0.next;
    }

}

class LinkedListNode<T>  {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode()  {
    }
    public LinkedListNode(T data)  {
        this.data = data;
    }
}

public class Sort012 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
        LinkedListNode<Integer> a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode<Integer> ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }

    }
}


