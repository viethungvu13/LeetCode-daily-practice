public class _19_Remove_Nth_Node_From_End_of_List {
    public static ListNode removeFirstNode(ListNode head) {
        if (head.next != null) {
            return head.next;
        }
        return null;
    }

    public static ListNode removeLastNode(ListNode head) {
        if (head.next != null) {
            ListNode currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            return head;
        }
        return null;
    }

    public static ListNode removeNode(ListNode head, int index) {
        if (head.next != null) {
            if (index == 0) {
                return removeFirstNode(head);
            } else if (index >= (lengthNode(head)-1)) {
                return removeLastNode(head);
            }
            int count = 0;
            ListNode currentNode = head;
            while (currentNode != null) {
                count++;
                if (count == index) {
                    ListNode nextNode = currentNode.next;
                    currentNode.next = nextNode.next;
                    break;
                }
                currentNode = currentNode.next;
            }
            return head;
        }
        return null;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next != null) {
            int index = lengthNode(head) - n;
            head = removeNode(head, index);
            return head;
        }
        return null;
    }

    public static int lengthNode(ListNode head) {
        if (head != null) {
            int count = 0;
            ListNode currentNode = head;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.next;
            }
            return count;
        }
        return 0;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
