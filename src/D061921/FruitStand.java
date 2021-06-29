package D061921;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FruitStand {

    public static void main(String[] args) {
        // write your code here
        List<Product> productList = new ArrayList<>();
        List<Meat> meatList = new ArrayList<>();
        List<Fruit> fruitList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of different meats: ");
        int meatAmount = scan.nextInt();
        scan.nextLine();

        for (int p = 0; p < meatAmount; p++) {
            System.out.println("Enter meat name: ");
            String name = scan.nextLine();
            int amount = (int) (Math.random() * 10) + 1;
            int price = (int) (Math.random() * 10) + 1;
            int weight = (int) (Math.random() * 5) + 1;
            System.out.println("Enter meat cut: ");
            String cut = scan.nextLine();
            System.out.println("Is the meat cooked? Enter: true/false ");
            boolean isCooked = scan.nextBoolean();
            scan.nextLine();
            productList.add(new Meat(name, amount, price, weight, cut, isCooked));
            meatList.add(new Meat(name, amount, price, weight, cut, isCooked));
        }

        System.out.println("Enter amount of different fruits: ");
        int fruitAmount = scan.nextInt();
        scan.nextLine();

        for (int o = 0; o < fruitAmount; o++) {
            System.out.println("Enter fruit name: ");
            String name = scan.nextLine();
            int amount = (int) (Math.random() * 10) + 1;
            int price = (int) (Math.random() * 10) + 1;
            int weight = (int) (Math.random() * 5) + 1;
            System.out.println("Enter fruit color: ");
            String color = scan.nextLine();
            System.out.println("Enter fruit size: small/medium/large");
            String size = scan.nextLine();
            productList.add(new Fruit(name, amount, price, weight, color, size));
            fruitList.add(new Fruit(name, amount, price, weight, color, size));
        }
//        System.out.println(meatList);
//        System.out.println(fruitList);
//        System.out.println(productList);

        displayProducts(productList);

        System.out.println("Enter product type: fruit/meat");
        String productType = scan.nextLine();

        // my method uses the amount of fruits and meats to determine which items to display when given a product type.

        Display.displayProducts(productList, productType, fruitAmount, meatAmount);

        // displayProduct finds the index of the list that corresponds to the previous produtct Type given.

        if (productType.equalsIgnoreCase("fruit") || productType.equalsIgnoreCase("f")) {
            System.out.println("Enter index: ");
            int indexI = scan.nextInt();
            displayProduct(fruitList, indexI);
        } else if (productType.equalsIgnoreCase("meat") || productType.equalsIgnoreCase("m")) {
            System.out.println("Enter index: ");
            int indexI = scan.nextInt();
            displayProduct(meatList, indexI);

        }

        scan.close();
    }

    public static void displayProducts(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void displayProduct(List productList, int index) {
        System.out.println(productList.get(index));
    }

}
/*
inputs that I use for testing

3
Chicken
cubed
false
steak
tips
true
Pork
shoulder
true
5
Banana
yellow
medium
Orange
orange
small
Watermelon
green
large
kiwi
brown
small
tomato
red
medium
fruit
2

*/