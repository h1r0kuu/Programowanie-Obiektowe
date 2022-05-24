import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Wycieczka {
    private Long id;
    private String place;
    private LocalDate tripDate;

    private boolean isReserved = false;
    public Wycieczka() {
    }

    public Wycieczka(Long id, String place, LocalDate tripDate) {
        this.id = id;
        this.place = place;
        this.tripDate = tripDate;
    }

    public Wycieczka(Long id, String place, LocalDate tripDate, boolean isReserved) {
        this.id = id;
        this.place = place;
        this.tripDate = tripDate;
        this.isReserved = isReserved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getTripDate() {
        return tripDate;
    }

    public void setTripDate(LocalDate tripDate) {
        this.tripDate = tripDate;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return "Wycieczka{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", tripDate=" + tripDate +
                ", isReserved=" + isReserved +
                '}';
    }
}

abstract class Biuro {
    List<Wycieczka> wycieczki = new ArrayList<>();

    public List<Wycieczka> getAllWycieczki() {
        return wycieczki;
    }

    public abstract void dodacWycieczke(Wycieczka w);
    public abstract void wyswietlicWycieczke(Wycieczka w);
    public abstract void rezerwowacWycieczke(Long wycieczkaId);

    public Wycieczka getWycieczkaById(Long wycieczkaId) {
        Wycieczka res = null;
        for(Wycieczka w : wycieczki) {
            if(w.getId() == wycieczkaId) {
                res = w;
            }
        }
        return res;
    }

    public boolean isWycieczkaRezerwowana(Long wycieczkaId) {
        Wycieczka w = getWycieczkaById(wycieczkaId);
        return w.isReserved();
    }

}

class BiuroItaka extends Biuro {
    private String name;

    public BiuroItaka(String name) {
        this.name = name;
    }

    @Override
    public void dodacWycieczke(Wycieczka w) {
        wycieczki.add(w);
    }

    @Override
    public void wyswietlicWycieczke(Wycieczka w) {
        System.out.println(w.toString());
    }

    @Override
    public void rezerwowacWycieczke(Long wycieczkaId) {
        if(isWycieczkaRezerwowana(wycieczkaId)) {
            throw new Error("Wycieczka jest już zarezerwowana");
        }
        Wycieczka w = getWycieczkaById(wycieczkaId);
        w.setReserved(true);
    }
}

public class Cw1 {
    public static void main(String[] args) {
        List<Wycieczka> wycieczkaList = new ArrayList<>(){{
            add(new Wycieczka(1L,"Milan", LocalDate.of(2022,7,9),true));
            add(new Wycieczka(2L,"Paris", LocalDate.of(2022,6,23)));
            add(new Wycieczka(3L,"Bangkok", LocalDate.of(2022,5,11),true));
            add(new Wycieczka(4L,"Hong Kong", LocalDate.of(2022,5,3)));
            add(new Wycieczka(5L,"Rome", LocalDate.of(2022,7,13)));
        }};
        BiuroItaka itaka = new BiuroItaka("Itaka");
        wycieczkaList.stream()
                     .forEach(itaka::dodacWycieczke);
        while (true) {
            System.out.println("Wszystkie wycieczki: ");
            for(Wycieczka w : itaka.getAllWycieczki()) {
                itaka.wyswietlicWycieczke(w);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wpisz id: ");
            Long id = scanner.nextLong();
            if(!itaka.isWycieczkaRezerwowana(id)) {
                itaka.rezerwowacWycieczke(id);
                System.out.println("Zarezerwowałeś");
            } else {
                System.out.println("Wycieczka jest już zarezerwowana");
            }
        }
    }
}
