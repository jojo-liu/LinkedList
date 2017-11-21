public class LinkedList {
    private ListNode head, tail;

    void append(int val) {
        if(this.head == null) {
            head = tail = new ListNode(val);
            return;
        }
        ListNode temp = new ListNode(val);
        tail.next = temp;
        tail = temp;
//        print();
    }

    public ListNode removeTail() {
        if(this.head == null) return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = this.head;
        ListNode curr = this.head;
        while(curr.next != tail) {
            curr = curr.next;
        }
        curr.next = null;
        tail = curr;
//        print();
        return dummyHead.next;//return head node in current LinkedList
    }

    public ListNode removeGreatThan(int target) {
        if(this.head == null) return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = this.head;
        ListNode curr = this.head, prev = dummyHead;
        while(curr != null) {
            if(curr.val > target) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        tail = prev;
//        print();
        return dummyHead.next;
    }

    public void print() {
        if(this.head == null) {
            System.out.println("null LinkedList");
            return;
        }
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}