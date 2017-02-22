package me.grapebaba;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class A237 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        ListNode nextNext = next.next;
        node.val = next.val;
        node.next = nextNext;
    }
}
