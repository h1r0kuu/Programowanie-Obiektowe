import java.time.LocalDateTime;
import java.util.UUID;

class DrogeriaBase {
    public Long id;
    public LocalDateTime createdAt;

    public DrogeriaBase() {
        this.createdAt = LocalDateTime.now();
    }

    public void create(Drogeria drogeria) {
        System.out.println("Successfuly create Drogeria with name : " + drogeria.getName());
    }
}

class Drogeria extends DrogeriaBase{
    public UUID uuid;
    public String name;

    public Drogeria(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Cw2 {
    public static void main(String[] args) {
        Drogeria drogeria = new Drogeria(UUID.randomUUID(), "Qwe");
        DrogeriaBase drogeriaBase = new DrogeriaBase();
        drogeriaBase.create(drogeria);
    }
}