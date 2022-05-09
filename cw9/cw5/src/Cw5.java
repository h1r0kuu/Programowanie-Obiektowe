class Kosmetyka {
    private String kosmetykaTyp;
    public Kosmetyka() {

    }

    public Kosmetyka(String typ) {
        kosmetykaTyp = typ;
    }

    public String getKosmetykaName() {
        return kosmetykaTyp;
    }


}

public class Cw5 {
    public static void main(String[] args) {
        Kosmetyka kosmetyka = new Kosmetyka("tt");
        System.out.println(kosmetyka.getKosmetykaName());
    }
}
