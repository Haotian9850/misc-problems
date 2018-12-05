package Algorithm;

public class ListNode {

    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }

    ListNode(int[] nums){
        this.val = nums[0];
        ListNode ptr = this;
        if(nums.length > 1){
            for(int i = 1; i < nums.length; ++ i){
                ptr.next = new ListNode(nums[i]);
                ptr = ptr.next;
            }
        }
    }

    public void visualize(){
        ListNode ptr = this.next;
        System.out.print(this.val);
        while(ptr != null){
            System.out.print(" -> " + ptr.val);
            ptr = ptr.next;
        }
    }

}

