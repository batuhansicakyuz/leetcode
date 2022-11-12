package easy;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode (0);
        ListNode head = dummy;
        while (true){
            if (l1==null){
                dummy.next=l2;
                break;
            }
            if (l2==null){
                dummy.next=l1;
                break;
            }
            if (l1.val<=l2.val){
                dummy.next=l1;
                l1=l1.next;
            }
            else {
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
        return head.next;
    }
}

