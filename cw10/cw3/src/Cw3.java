import java.util.UUID;

class HomeBase {
    public UUID uuid;
    public int floorQty;

    public HomeBase(int floorQty) {
        this.floorQty = floorQty;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }
}

class Home extends HomeBase{
    public String address;
    public String asd;
    public Home(int floorQty, String address) {
        super(floorQty);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

public class Cw3 {
    public static void main(String[] args) {
        Home home = new Home(10, "ul. Qwe 12");
        System.out.println(home.getAddress());
    }
}
