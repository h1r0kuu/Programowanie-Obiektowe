import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class Waluta {
    double a;
    double b;
    String fromTo;
    private static HashMap<String, Double> ceny = new HashMap<>(){{
        put("dol-pl", 4.31);
        put("eur-usd", 1.08);
        put("pl-uah", 6.84);
    }};

    public Waluta() {}
    public Waluta(double a, String fromTo) {
        this.a = a;
        this.fromTo = fromTo;
    }

    public double getPrice(String fromTo) {
        return ceny.get(fromTo);
    }

    public double convert() {
        double cena = getPrice(fromTo);
        return a * cena;
    }

    public String secondWaluteToUpper() {
        return fromTo.split("-")[1].toUpperCase();
    }

    public static void cennik() {
        Set<String> fromTo = ceny.keySet();
        for(String c : fromTo) {
            System.out.println(c + " : " + ceny.get(c));
        }
    }
}


public class Cw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Waluta.cennik();
        System.out.println("Wpisz jakie waluty chcesz przeliczać(w formaćie waluta1-waluta2): ");
        String fromTo = scanner.nextLine();
        System.out.println("Wpisz ilość waluty: ");
        double a = scanner.nextDouble();
        Waluta waluta = new Waluta(a,fromTo);
        System.out.println( waluta.convert() + " " +waluta.secondWaluteToUpper());
    }
}
