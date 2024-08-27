public class _24_Swap_Nodes_in_Pairs {
    public static ListNode addFirstNode(ListNode head, ListNode newNode) {
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    public static ListNode addLastNode(ListNode head, ListNode newNode) {
        if (head == null) {
            return newNode;
        }
        ListNode curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        return head;
    }
    
    public static ListNode addAtIndex(ListNode head, ListNode newNode, int index) {
        if (index == 0) {
            return addFirstNode(head, newNode);
        } else if (index >= lengthNode(head)) {
            return addLastNode(head, newNode);
        }
        ListNode curNode = head;
        int count = 0;
        while (curNode != null) {
            count++;
            if (count == index) {
                ListNode nextNode = curNode.next;
                curNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            curNode = curNode.next;
        }
        return head;
    }

    public static ListNode swapPairs(ListNode head) {
        if (head != null) {
            if (head.next != null) {
                ListNode curNode = head;
                int count = 0;
                while(curNode != null && curNode.next != null) {
                    ListNode nextNode = curNode.next;
                    curNode.next = nextNode.next;
                    head = addAtIndex(head, nextNode, count);
                    count+=2;
                    curNode = curNode.next;
                }
            }
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