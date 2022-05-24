class Samochod {
    private String paliwo;
    private int price;

    public Samochod() {}

    public Samochod(String paliwo, int price) {
        this.paliwo = paliwo;
        this.price = price;
    }

    protected int getPrice() {
        return price;
    }

    protected String getPaliwo() {
        return paliwo;
    }
}

class BMW extends Samochod {
    private final String country = "USA";
    private String model;

    public BMW() {}
    public BMW(String paliwo, int price, String model) {
        super(paliwo, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printInfo() {
        System.out.println(model + "\n" + super.getPaliwo() + "\n" + super.getPrice());
    }
}

public class Cw3 {
    public static void main(String[] args) {
        BMW x5 = new BMW("Diesel", 100000, "BMW Seria 5");
        x5.printInfo();
    }
}
