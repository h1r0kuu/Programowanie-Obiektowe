import java.util.Scanner;

class Kalkualtor {
    int a;
    int b;
    char dzialanie;
    public Kalkualtor(int a, int b, char dzialanie) {
        this.a = a;
        this.b = b;
        this.dzialanie = dzialanie;
    }
    public int plus(int a, int b){return a + b;}
    public int minus(int a, int b){return a - b;}
    public int multiply(int a, int b){return a * b;}
    public double divide(int a, int b) {return Double.valueOf(a) / Double.valueOf(b);}
    public void calculate() {
        switch (dzialanie) {
            case '+':
                print(a,b,'+', plus(a,b));
                break;
            case '-':
                print(a,b,'-',minus(a,b));
                break;
            case '*':
                print(a,b,'*', multiply(a,b));
                break;
            case '/':
                print(a,b,'/', divide(a,b));
                break;
        }
    }

    private void print(int a, int b, char dzialanie, double res) {
        System.out.println(a + " " + dzialanie + " " + b + " = " + res);
    }


}

public class Cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz a: ");
        int a = scanner.nextInt();
        System.out.print("Wpisz b: ");
        int b = scanner.nextInt();
        System.out.print("Wpisz dzialanie: ");
        String c = scanner.next();

        Kalkualtor kalkualtor = new Kalkualtor(a,b,c.charAt(0));
        kalkualtor.calculate();
    }
}
