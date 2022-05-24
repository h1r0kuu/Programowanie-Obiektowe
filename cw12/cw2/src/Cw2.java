import java.text.DecimalFormat;

class WymianaWalut {
    public static int a,b,c;
    public static int zl, dol;
    public static double wspolczynnikKonwersji = 4.28;
    public static double dolToZl(int dol) {
        return dol * wspolczynnikKonwersji;
    }
    public static double zlToDol(int zl) {
        return zl / wspolczynnikKonwersji;
    }

    public static void kwoty(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }
}

public class Cw2 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        WymianaWalut.kwoty(10,20,30);
        System.out.println(
                WymianaWalut.a + "zl = " + df.format( WymianaWalut.zlToDol(WymianaWalut.a) ) + " $" + "\n" +
                WymianaWalut.b + "$ = " + df.format( WymianaWalut.dolToZl(WymianaWalut.b) ) + " zl" + "\n" +
                WymianaWalut.c + "zl = " + df.format( WymianaWalut.zlToDol(WymianaWalut.c) ) + " $"
        );
    }
}
