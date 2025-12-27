public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Cafe");

        MenuItem pizza = new FoodItem("Pizza", 2500);
        MenuItem burger = new FoodItem("Burger", 1500);
        MenuItem cola = new DrinkItem("Cola", 800);

        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(cola);

        System.out.println(restaurant);

        System.out.println("\nFood only:");
        System.out.println(restaurant.filterByCategory("Food"));

        System.out.println("\nSorted by price:");
        System.out.println(restaurant.sortByPrice());

        Order order = new Order(1);
        order.addItem(pizza);
        order.addItem(cola);

        System.out.println("\n" + order);
    }
}
