package D061921;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Product {
    public String name;
    public int amount;
    public int price;
    public int weight;

    public Product(String name, int amount, int price, int weight) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.weight = weight;
    }

    public String toString() {
        if (amount >= 0) {
            return String.format("{name: %s, amount: %s, price: %s, weight: %s}", name, amount, price, weight);
        }
        return "ERR negative amount";
    }
}
