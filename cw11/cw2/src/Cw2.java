class Obuwie {
    private int rozmiar;
    public Obuwie() {}
    public Obuwie(int rozmiar) {
        this.rozmiar = rozmiar;
    }
    protected int getRozmiar() {
        return rozmiar;
    }


}

class newBalance extends Obuwie {
    private final String COUNRTY = "USA";
    private String name;
    private int price;

    public newBalance() {}
    public newBalance(int rozmiar, int price, String name) {
        super(rozmiar);
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.print(name + " " + super.getRozmiar());
    }

    public int getPrice() {
        return price;
    }
}

public class Cw2 {
    public static void main(String[] args) {
        newBalance b = new newBalance(5, 600,"QWE");
        b.print();
        System.out.print(" " + b.getPrice());
    }
}
