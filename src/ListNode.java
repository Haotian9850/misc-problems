public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){
        //default constructor
        this.val = -1;
        this.next = null;
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int[] nums){
        this.val = nums[0];
        ListNode ptr = this;
        for(int i = 1; i < nums.length; ++ i){
            ListNode newNode = new ListNode(nums[i]);
            ptr.next = newNode;
            ptr = ptr.next;
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        ListNode ptr = this;
        while(ptr != null){
            result.append(ptr.val);
            result.append("->");
            ptr = ptr.next;
        }
        return result.toString().substring(0, result.toString().length() - 2);
    }

}
