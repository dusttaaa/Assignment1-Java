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

        MenuItemDAO dao = new MenuItemDAO();

        dao.addMenuItem(pizza);
        dao.addMenuItem(burger);
        dao.addMenuItem(cola);

        System.out.println("\nFrom database:");
        dao.getAllMenuItems();

        dao.updatePrice("Pizza", 2700);
        dao.deleteMenuItem("Burger");
    }
}