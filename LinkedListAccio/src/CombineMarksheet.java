public class CombineMarksheet {

    static Node combine(Node list1, Node list2){
       Node temp1 = list1;
       Node temp2 = list2;

       Node ans = new Node(-1);
       Node temp = ans;

       while(temp1!=null && temp2!=null){
           if(temp1.marks<=temp2.marks){
               temp.nextmarks = temp1;
               temp1 = temp1.nextmarks;
               temp = temp.nextmarks;
           }else{
               temp.nextmarks = temp2;
               temp2 = temp2.nextmarks;
               temp = temp.nextmarks;
           }
       }
       if(temp1 != null){
           temp.nextmarks = temp1;
       }
        if(temp2 != null){
            temp.nextmarks = temp2;
        }
        return ans.nextmarks;
    }
    public static void main(String[] args) {

    }
}
class Node{
    int marks;
    Node nextmarks;
    Node(int marks){
        this.marks = marks;
    }
}
