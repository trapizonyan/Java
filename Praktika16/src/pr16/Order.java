package pr16;

public interface Order {
    boolean add(Item item);
    boolean remove(String name);
    void removeAll(String name);
    Item[] getAllItems();
    int getCount();
    public Item[] getItems();
    double priceTotal();
    int itemQuantity(String name);
}
