public class linkedlistPalindrome {

    public static boolean isPalindrome(ListNode head){
        //reverse half approach: need to handle odd and even number of nodes
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            //System.out.println(slow.val);
            fast = fast.next.next;
            //System.out.println(fast.val);
        }

        if(fast == null){
            slow = slow.next;
        }

        slow = reverse(slow);
        //compare
        ListNode ptr = head;
        while(slow != null && slow.next != null){
            if(ptr.val != slow.val){
                return false;
            }
            slow = slow.next;
            ptr = ptr.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1, 5};
        ListNode head = new ListNode(nums);
        System.out.println(isPalindrome(head));
    }
}
