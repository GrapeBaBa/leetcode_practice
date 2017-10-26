package me.grapebaba;

public class A237 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        ListNode nextNext = next.next;
        node.val = next.val;
        node.next = nextNext;
    }
}
