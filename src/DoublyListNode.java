public class DoublyListNode {

    public int val;
    public DoublyListNode next;
    public DoublyListNode prev;

    public DoublyListNode(){
        //defualt constructor
        this.val = -1;
        this.next = null;
        this.prev = null;
    }

    public DoublyListNode(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }

    public DoublyListNode(int[] nums){
        this.val = nums[0];
        DoublyListNode curr = this;
        for(int i = 1; i < nums.length; ++ i){
            DoublyListNode next = new DoublyListNode(nums[i]);
            next.prev = curr;
            curr.next = next;
            curr = curr.next;
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        DoublyListNode ptr = this;
        while(ptr != null){
            result.append(ptr.val + "<=>");
            ptr = ptr.next;
        }
        return result.toString().substring(0, result.toString().length() - 3);
    }


}
