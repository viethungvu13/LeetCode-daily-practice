public class _2_Add_Two_Numbers {
    public static int lengthNode(ListNode head) {
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static ListNode addLastNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head != null) {
            ListNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            return head;
        }
        return newNode;
    }

    public static void checkLength(ListNode node1, ListNode node2) {
        int lengthNode1 = lengthNode(node1);
        int lengthNode2 = lengthNode(node2);
        if (lengthNode1 < lengthNode2) {
            for (int i = 0; i < (lengthNode2 - lengthNode1); i++) {
                node1 = addLastNode(node1, 0);
            }
        } else if (lengthNode1 > lengthNode2) {
            for (int i = 0; i < (lengthNode1 - lengthNode2); i++) {
                node2 = addLastNode(node2, 0);
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        checkLength(l1, l2);
        ListNode newNode = null;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        int temp = 0;
        while (currentNode1 != null && currentNode2 != null) {
            int val = currentNode1.val + currentNode2.val + temp;
            if (val < 10) {
                newNode = addLastNode(newNode, val);
                temp = 0;
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            } else {
                newNode = addLastNode(newNode, val % 10);
                temp = 1;
                currentNode1 = currentNode1.next;
                currentNode2 = currentNode2.next;
            }
        }
        if (temp != 0) {
            newNode = addLastNode(newNode, temp);
        }
        return newNode;
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
