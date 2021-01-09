package pr16;

public class Test {
    public static void main(String[] ar) {
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();

        try {
            Item cap = new Drink("Cola", "1", 100);
            Item wine = new Drink("Red Wine", "0.7", 843);
            Item coffee = new Drink("Americano", "0.3", 80);
            Item roast = new Dish("Roast", "beef stew with potatoes and vegetables", 180);
            Item dumplings = new Dish("Caesar salad", "salad with chicken, vegetables and special sauce. Served with crackers", 150);
            Item smoothie = new Dish("Honey cake", "cake with honey, sponge cake and delicious creamy caramel cream", 95);

            restaurantOrder.add(cap);
            restaurantOrder.add(coffee);

            internetOrder.add(roast);
            internetOrder.add(wine);
            internetOrder.add(smoothie);

            restaurantOrder.add(dumplings);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(roast);

            orderManager.add(1, restaurantOrder);
            orderManager.add(2, restaurantOrder);
            orderManager.add("Moscow", internetOrder);

            System.out.println(restaurantOrder.priceTotal());
            System.out.println(orderManager.RestaurantOrdersCostSummary());
            System.out.println(restaurantOrder.getCount());
            System.out.println(restaurantOrder.itemQuantity("Caesar salad"));
            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

            internetOrder.remove("Caesar salad");

            System.out.println(internetOrder.getCount());
            System.out.println(internetOrder.priceTotal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}