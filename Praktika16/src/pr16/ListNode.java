package pr16;

public class ListNode {
    Item item;
    ListNode next;
    ListNode prev;

    ListNode(Item item) {
        this(null, item, null);
    }

    ListNode(ListNode previous, Item item, ListNode next) {
        this.item = item;
        this.next = next;
        this.prev = previous;
    }
}