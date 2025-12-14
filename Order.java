public class Order {
    private int orderId;
    private MenuItem item;
    private int quantity;

    public Order(int orderId, MenuItem item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void printOrder() {
        System.out.println("\nOrder #" + orderId);
        item.printInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + getTotalPrice() + "tg");
    }
}

