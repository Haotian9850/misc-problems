public class ReverseLinkedList {
    public ListNode reverseLinkedListIterative(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;    //remeber this step. ptr next will be moved to next.next, just not here!
        }
        return prev;
    }
}
