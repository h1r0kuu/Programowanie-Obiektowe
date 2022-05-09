import java.util.Scanner;

class Gra {
    private boolean stop;
    private int x,y;
    public Gra() {
        this.x = 0;
        this.y = 0;
    }

    public Gra(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printXY() {
        System.out.println("x: " + x + "; y: " + y);
    }

    public void run() {
        stop = false;
        while (!stop) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Direction(W, A, S, D) or EXIT: ");
            String dir = scanner.nextLine();
            switch (dir.toUpperCase()) {
                case "W":
                    y++;
                    break;
                case "A":
                    x--;
                    break;
                case "S":
                    y--;
                    break;
                case "D":
                    x++;
                    break;
                case "EXIT":
                    stop = true;
                    break;
                default:
                    System.out.println("Unknown commad");
                    break;
            }
            printXY();
        }
    }
}

public class Cw4 {
    public static void main(String[] args) {
        Gra gra = new Gra(10, 20);
        gra.run();
    }
}
