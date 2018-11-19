public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
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
