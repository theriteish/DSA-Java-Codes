public class isPalindrome {
    public static void main(String[] args) {


    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;

        temp2 = reverse(temp2);

        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            curr.next = prev;
            ListNode next = curr.next;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
