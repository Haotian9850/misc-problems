package Algorithm;

import java.util.Arrays;
import java.util.List;

public class MergeKSortedList {

    public static ListNode merge(List<ListNode> list){
        //binary impl
        //validate input
        if(list.size() == 0 || list.size() == 1){
            throw new RuntimeException("Malformed input!");
        }
        int end = list.size() - 1;
        while(end > 0){
            //merge lists
            int start = 0;
            while(start < end){
                list.set(start, merge2(list.get(start), list.get(end)));
                ++ start;
                -- end;
            }
        }
        return list.get(0);
    }

    private static ListNode merge2(ListNode l1, ListNode l2){
        //merge two alreday sorted lists
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                //compare & append
                if(l1.val < l2.val){
                    ptr.next = l1;
                    l1 = l1.next;
                }else{
                    ptr.next = l2;
                    l2 = l2.next;
                }
                ptr = ptr.next;
            }
            if(l1 == null){
                ptr.next = l2;
                break;
            }
            if(l2 == null){
                ptr.next = l1;
                break;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args){
        int[] testArray = {1, 2, 3, 4, 5, 6, 7};
        int[] listArray1 = {2, 15, 16, 456, 999, 12345, 123456};
        int[] listArray2 = {0, 0, 0, 1, 1, 1, 2, 2, 3};
        ListNode head1 = new ListNode(testArray);
        ListNode head2 = new ListNode(listArray1);
        ListNode head3 = new ListNode(listArray2);
        List<ListNode> testList = Arrays.asList(head1, head2, head3);
        ListNode result = merge(testList);
        result.visualize();
    }

}
