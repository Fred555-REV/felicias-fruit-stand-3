package D061921;

import java.util.List;

@SuppressWarnings("ALL")

public class Meat extends Product {
    public String cut;
    public boolean isCooked;

    public Meat(String name, int amount, int price, int weight, String cut, boolean isCooked) {
        super(name, amount, price, weight);
        this.cut = cut;
        this.isCooked = isCooked;
    }

    @Override
    public String toString() {
        if (amount >= 0) {
            return String.format("{name: %s, amount: %s, price: %s, weight: %s, cut: %s, isCooked: %s}", name, amount, price, weight, cut, isCooked);
        }
        return "ERR negative amount";
    }
}
