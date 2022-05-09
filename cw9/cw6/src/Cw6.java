import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}

class Koszykowka {
    private List<Product> products = new ArrayList<>();
    public Koszykowka() {

    }

    public Koszykowka(Product p) {
        products.add(p);
    }

    public void addProductToKoszyk(Product p) {
        products.add(p);
    }

    public void getProducts() {
        for(Product p : products) {
            System.out.println(p.toString());
        }
    }
}

public class Cw6 {
    public static void main(String[] args) {
        Product product = new Product("dasdas", 50);
        Koszykowka koszykowka = new Koszykowka(product);
        koszykowka.addProductToKoszyk(new Product("dasdmasdsad", 100));
        koszykowka.getProducts();
    }
}
