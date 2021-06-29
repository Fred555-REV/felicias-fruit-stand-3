package D061921;

import java.security.PublicKey;
import java.util.List;

@SuppressWarnings("ALL")

public class Fruit extends Product {
    public String color;
    public String size;

    public Fruit(String name, int amount, int price, int weight, String color, String size) {
        super(name, amount, price, weight);
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        if (amount >= 0) {
            return String.format("{name: %s, amount: %s, price: %s, weight: %s, color: %s, size: %s}", name, amount, price, weight, color, size);
        }
        return "ERR negative amount";
    }
}
