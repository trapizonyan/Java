package pr16;

public class RestaurantOrder implements Order {
    private int count;
    private Item[] items;

    public RestaurantOrder() {
        count = 0;
        items = new Item[20];
    }

    public boolean add(Item item) {
        if (items.length == count) {
            Item[] temp = new Item[count + 2];
            System.arraycopy(items, 0, temp, 0, temp.length);
            items = temp;
        }
        try {
            items[count] = item;
            count++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void removeAll(String name) {
        while (true) {
            if (!remove(name)) {
                break;
            }
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(name)) {
                if (i == count) {
                    items[i] = null;
                } else {
                    items[i] = items[count];
                    items[count] = null;
                }
                count--;
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    public Item[] getAllItems() {
        return items;
    }

    public Item[] getItems() {
        Item[] item = new Item[getCount()];
        boolean flag = true;
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < item.length; j++) {
                    if (item[j] != null) {
                        if (item[j].getName().equals(items[i].getName())) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    for (int j = 0; j < item.length; j++) {
                        if (item[j] == null) {
                            item[j] = items[i];
                            break;
                        }
                    }
                }
                flag = true;
            }
        }
        return item;
    }

    public double priceTotal() {
        double total = 0;
        for (Item item : items) {
            if (item != null)
                total += item.getPrice();
        }
        return total;
    }

    public Item[] SortedItemsByPrice() {
        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j] != null && items[j + 1] != null) {
                    if (items[j].getPrice() > items[j + 1].getPrice()) {
                        Item tmp = items[j];
                        items[j] = items[j + 1];
                        items[j + 1] = tmp;
                    }
                }
            }
        }
        return items;
    }

    public int itemQuantity(String name) {
        int quantity = 0;
        for (int i = 0; i < count; i++) {
            if (items[i].getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }
}