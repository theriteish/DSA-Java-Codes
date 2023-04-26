import java.util.LinkedList;
import java.util.Scanner;

public class Questions {

   static class Node{
        int data;
        Node next;
        Node(int key){
            data = key;
            next = null;
        }
    }
    public static void addToTheLast(int data){
        if(head == null){
            head = new Node(data);
            temp =head;
            return ;
        }
        else{
            Node new_node = new Node(data);
            temp.next = new_node;
            temp=temp.next;
            return;
        }
    }

    public static void printList(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    static Node head;
    static Node temp;
    public static Node correctOrder(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node n1 = head;

        Node n2 = slow.next;
        slow.next = null;

        n2 = reverse(n2);

        Node temp = new Node(-1);
        Node ans = temp;

        while(n1!=null || n2!=null){
            if(n1!=null){
                ans.next = n1;
                n1 = n1.next;
                ans = ans.next;
            }
            if(n2!=null){
                ans.next = n2;
                n2 = n2.next;
                ans = ans.next;
            }
        }
        return temp.next;
    }
    public void partition(Node head, int x) {
        // Your code here
        Node curr = head;

        Node left = new Node(-1);
        Node right = new Node(-1);

        Node tempL = left;
        Node tempR = right;
        while(curr!=null){
            if(curr.data<x){
                tempL.next = curr;
                tempL = tempL.next;
            }else{
                tempR.next = curr;
                tempR = tempR.next;
            }
            curr = curr.next;
        }
        tempL.next = right.next;
        tempR.next = null;
        Node ans = left.next;

        while(ans!=null){
            System.out.print(ans.data+" ");
            ans = ans.next;
        }
    }

//    public Node rearrangeList(Node head) {
//        Node even = new Node(-1);
//        Node odd =  new Node(-1);
//        Node tEven = even;
//        Node tOdd = odd;
//
//
//        Node curr = head;
//        while(curr!=null){
//            if(isEven(curr.val)){
//                tEven.next = curr;
//                tEven = tEven.next;
//            }else{
//                tOdd.next = curr;
//                tOdd = tOdd.next;
//            }
//            curr = curr.next;
//        }
//
//        tEven.next = odd.next;
//        tOdd.next = null;
//
//        return even.next;
//
//    }



    public static Node reverse(Node head){
        // write code here
        Node prev = null;
        Node curr = head;

        while(curr != null){
            //save the next node address:
            Node nextOfCurr = curr.next;

            //reversing the connection:
            curr.next = prev;

            //updation part:
            prev = curr;
            curr = nextOfCurr;

        }
        head = prev;
        return head;
    }


    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();

//        while(t-- > 0){
//            int n = sc.nextInt();
//            int a1 = sc.nextInt();
//            head = null;
//            temp = null;
//            addToTheLast(a1);
//
//            for(int i = 1; i < n; i++){
//                int data = sc.nextInt();
//                addToTheLast(data);
//            }
//
//            Node node = rearrange(head);
//            printList(node);
//            System.out.println();
   //     }


        LinkedList<Integer> list = new LinkedList<>();
        list.add(85);
        list.add(89);
        int a = list.get(1);
        System.out.println(a);
        System.out.println(list);
    }
}
