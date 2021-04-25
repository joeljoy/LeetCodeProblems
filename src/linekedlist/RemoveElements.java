package linekedlist;

public class RemoveElements {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (curr.val == val) {
                if (prev != null) {
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    curr = curr.next;
                    head = curr;
                }
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
