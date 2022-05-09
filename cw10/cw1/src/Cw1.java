import java.time.LocalDateTime;

class Kiosk {
    public String name;
    public LocalDateTime createdAt;

    public Kiosk(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}

class KioskZGazetami extends Kiosk {
    public String gazetaName;
    public int priceGazety;

    public KioskZGazetami(String name, String gazetaName, int priceGazety) {
        super(name);
        this.gazetaName = gazetaName;
        this.priceGazety = priceGazety;
    }

    public String getGazetaName() {
        return gazetaName;
    }

    public int getPriceGazety() {
        return priceGazety;
    }
}

public class Cw1 {
    public static void main(String[] args) {
        KioskZGazetami kioskZGazetami = new KioskZGazetami("Kiosk ABC", "gazeta 'qwerty'", 1);
        System.out.println(kioskZGazetami.getCreatedAt());
        System.out.println(kioskZGazetami.getGazetaName());
        System.out.println(kioskZGazetami.getPriceGazety());
    }
}
