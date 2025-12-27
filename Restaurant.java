import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant {
    private final String name;
    private final List<MenuItem> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> searchByName(String keyword) {
        return menu.stream()
                .filter(item -> item.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<MenuItem> filterByCategory(String category) {
        return menu.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public List<MenuItem> sortByPrice() {
        return menu.stream()
                .sorted(Comparator.comparingDouble(MenuItem::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + ", Menu: " + menu;
    }
}
