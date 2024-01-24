package Day4.Tasks;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menuItems;
    private List<Double> prices;
    private List<Double> ratings;

    public Restaurant() {
        this.menuItems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        menuItems.add(item);
        prices.add(price);
        ratings.add(0.0);
    }

    public void removeItem(String item) {
        int index = menuItems.indexOf(item);
        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
        }
    }

    public void rateItem(String item, double rating) {
        int index = menuItems.indexOf(item);
        if (index != -1) {
            ratings.set(index, rating);
        }
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (double rating : ratings) {
            totalRating += rating;
        }

        return totalRating / ratings.size();
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Burger", 10.99);
        restaurant.addItem("Pizza", 12.99);
        restaurant.addItem("Pasta", 8.99);

        restaurant.rateItem("Burger", 4.5);
        restaurant.rateItem("Pizza", 4.0);

        double avgRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + avgRating);

        List<String> menuItems = restaurant.getMenuItems();
        List<Double> prices = restaurant.getPrices();
        List<Double> ratings = restaurant.getRatings();

        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - $" + prices.get(i) + " Rating:" + ratings.get(i));
        }
    }
}
