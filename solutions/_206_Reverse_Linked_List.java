public class _206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
