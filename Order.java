import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderId;
    private final List<MenuItem> items;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order #" + orderId + ", Items: " + items + ", Total: " + getTotalPrice() + " tg";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }
}
