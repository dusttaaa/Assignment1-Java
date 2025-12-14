public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Cafe");
        restaurant.printRestaurant();

        MenuItem pizza = new MenuItem("Pizza", 2500);
        MenuItem burger = new MenuItem("Burger", 1500);

        pizza.printInfo();
        burger.printInfo();

        Order order1 = new Order(1, pizza, 2);
        Order order2 = new Order(2, burger, 3);

        order1.printOrder();
        order2.printOrder();

        if (pizza.getPrice() > burger.getPrice()) {
            System.out.println("\nPizza is more expensive than Burger");
        } else {
            System.out.println("\nBurger is more expensive than Pizza");
        }
    }
}

