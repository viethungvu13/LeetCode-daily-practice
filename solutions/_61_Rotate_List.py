class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def rotateRight(self, head, k):
        if not head or not head.next or k == 0:
            return head
        
        lengthNode = self.findLength(head)
        k = k % lengthNode

        if k == 0:
            return head
        
        checkNode = self.findElement(head, k)
        endNode = self.findEnd(head)
        
        temp = checkNode.next
        checkNode.next = None
        endNode.next = head
        
        return temp

    def findElement(self, head, k):
        check = self.findLength(head) - k
        count = 1
        currentNode = head
        while count < check:
            currentNode = currentNode.next
            count += 1
        return currentNode

    def findEnd(self, head):
        currentNode = head
        while currentNode.next.next is not None:
            currentNode = currentNode.next
        endNode = currentNode.next
        return endNode
    
    def findLength(self, head):
        count = 1
        currentNode = head
        while currentNode.next is not None:
            currentNode = currentNode.next
            count += 1
        return count