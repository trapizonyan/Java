package pr16;

public class InternetOrder implements Order {
    private ListNode front;
    private int count;

    public InternetOrder() {
        front = null;
    }

    public InternetOrder(RestaurantOrder order) {
        Item[] items = order.getAllItems();
        for (Item item : items) {
            add(item);
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public boolean add(Item item) {
        try {
            if (isEmpty())
                front = new ListNode(item);
            else {
                ListNode temp = front;
                front = new ListNode(null, item, temp);
                front.next.prev = front;
            }
            count++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean remove(String name) {
        if (isEmpty())
            return false;
        if (front.item != null) {
            if (front.item.getName().equals(name)) {
                front = front.next;
                return true;
            }
        }

        ListNode current = front;
        boolean flag = true;

        while (flag) {
            current = current.next;
            if (current == null) {
                flag = false;
            } else if (current.item != null) {
                if (current.item.getName().equals(name)) {
                    flag = false;
                }
            }
        }
        if (current == null)
            return false;
        if (current.next != null)
            current.next.prev = current.prev;
        current.prev.next = current.next;
        count--;
        return true;
    }

    public void removeAll(String name) {
        boolean flag = true;
        while (flag) {
            if (!remove(name)) {
                flag = false;
            }
        }
    }

    public int getCount() {
        return count;
    }

    public Item[] getAllItems() {
        int i = 0;
        Item[] order = new Item[getCount()];
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.item != null) {
                    order[i] = temp.item;
                    i++;
                }
                temp = temp.next;
            }
        }
        return order;
    }

    public double priceTotal() {
        double cost = 0;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.item != null) {
                    cost += temp.item.getPrice();
                }
                temp = temp.next;
            }
        }
        return cost;
    }

    public int itemQuantity(String name) {
        int quantity = 0;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.item != null) {
                    if (temp.item.getName().equals(name)) {
                        quantity++;
                    }
                }
                temp = temp.next;
            }
        }
        return quantity;
    }

    public Item[] getItems() {
        Item[] item = new Item[getCount()];
        boolean flag = true;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.item != null) {
                    for (int i = 0; i < 6; i++) {
                        if (item[i] != null) {
                            if (temp.item.getName().equals(item[i].getName())) {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        for (int i = 0; i < 6; i++) {
                            if (item[i] == null) {
                                item[i] = temp.item;
                                break;
                            }
                        }
                    }
                    flag = true;
                }
                temp = temp.next;
            }
        }
        return item;
    }
}