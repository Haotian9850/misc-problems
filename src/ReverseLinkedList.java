public class ReverseLinkedList {
    public static ListNode reverseLinkedListIterative(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;    //remember this step. ptr next will be moved to next.next, just not here!
        }
        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode ptr = head;
        int cnt = 2;
        while(cnt <= 10){
            ListNode next = new ListNode(cnt);
            ptr.next = next;
            ptr = ptr.next;
            ++ cnt;
        }
        System.out.println(head.toString());
        ListNode reversedHead = reverseLinkedListIterative(head);
        System.out.println(reversedHead.toString());

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        ListNode result = new ListNode(nums);
        System.out.println(result.toString());

    }
}
