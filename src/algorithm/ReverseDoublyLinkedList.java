package algorithm;

public class ReverseDoublyLinkedList {


    public static DoublyListNode reverse(DoublyListNode head){
        DoublyListNode curr = head;
        DoublyListNode prev = null;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }

    public static void main(String[] args){
        int[] testArray = {1, 2, 3, 4, 5, 6};

        DoublyListNode head = new DoublyListNode(testArray);
        System.out.println(head.toString());

        System.out.println(reverse(head));
    }
}



