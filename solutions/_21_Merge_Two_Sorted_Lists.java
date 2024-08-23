public class _21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null) {
            return list2;
        } else if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 != null && list2 != null) {
            ListNode newList = null;
            ListNode currentNode1 = list1;
            ListNode currentNode2 = list2;
            int count = 0;
            int lengthNode1 = lengthNode(list1);
            int lengthNode2 = lengthNode(list2);
            int lengthNewNode = lengthNode1 + lengthNode2;
            while (count < lengthNewNode) {
                if (currentNode1 != null && currentNode2 != null) {
                    if (currentNode1.val <= currentNode2.val) {
                        newList = addLastNode(newList, currentNode1.val);
                        currentNode1 = currentNode1.next;
                    } else {
                        newList = addLastNode(newList, currentNode2.val);
                        currentNode2 = currentNode2.next;
                    }
                    count++;
                } else {
                    if (currentNode1 != null) {
                        newList = addLastNode(newList, currentNode1.val);
                        currentNode1 = currentNode1.next;
                    } else if (currentNode2 != null) {
                        newList = addLastNode(newList, currentNode2.val);
                        currentNode2 = currentNode2.next;
                    }
                    count++;
                }
            }
            return newList;
        }
        return null;
    }

    public static ListNode addLastNode(ListNode head, int val) {
        if (head == null) {
            ListNode newNode = new ListNode(val);
            return newNode;
        }
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        ListNode newNode = new ListNode(val);
        currentNode.next = newNode;
        return head;
    }

    public static int lengthNode(ListNode head) {
        if (head == null) return 0;
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
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