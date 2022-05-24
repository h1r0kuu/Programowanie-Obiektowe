package cw1;

class Figura {
    protected double[] strony;
    protected int[] stopnieStron;
    private final double PI = Math.PI;

    public Figura() {}
    public Figura(double[] strony, int[] stopnieStron) {
        if(strony.length != stopnieStron.length) {
            throw new Error("error");
        }
        this.strony = strony;
        this.stopnieStron = stopnieStron;
    }

    protected double getPi() {
        return PI;
    }
}

class Kolo extends Figura {
    private int R;
    public Kolo(int R) {
        this.R = R;
    }

    public double S() {
        return super.getPi() * Math.pow(R, 2);
    }
}

class Trojkat extends Figura {
    public Trojkat() {}
    public Trojkat(double[] strony, int[] stopnieStron) {
        super(strony, stopnieStron);
        if(strony.length != 3) {throw new Error("error");}
        int sum = 0;
        for(int stopien : stopnieStron) {
            sum += stopien;
        }
        if (sum != 180) {
            throw new Error("Error");
        }
    }

    public double S() {
        return 0.5 * strony[0] * strony[1] * Math.sin( Math.toRadians((double) stopnieStron[0]) );
    }
}

public class Cw1 {
    public static void main(String[] args) {
        Kolo k = new Kolo(5);
        System.out.println("S = " + k.S());
        Trojkat t = new Trojkat(new double[]{5.0,6.0,7.0},new int[] {60,30,90});
        System.out.println("S = " + t.S());
    }
}
