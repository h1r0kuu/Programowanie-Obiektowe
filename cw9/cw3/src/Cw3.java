class MatrixError extends  Exception {
    public MatrixError() {
        super();
    }

    public MatrixError(String msg) {
        super(msg);
    }
}

interface MacierzImpl {
    boolean canSum(int[][] second);
    int[][] sum(int[][] second) throws MatrixError;
    boolean canMultiply(int[][] second);
    int[][] multiply(int[][] second) throws MatrixError;
    void print(int[][] arr);
}

class Macierz implements MacierzImpl{
    private int rows;
    private int cols;
    int[][] macierz;

    public Macierz(int[][] numbers) {
        this.rows = numbers.length;
        this.cols = numbers[0].length;
        this.macierz = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                this.macierz[i][j] = numbers[i][j];
            }
        }
    }

    public Macierz(int cols, int rows, String typ) {
        this.rows = rows;
        this.cols = cols;
        this.macierz = new int[rows][cols];
        if(typ.equals("zerowa")) {
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    macierz[i][j] = 0;
                }
            }
        }
    }

    @Override
    public boolean canSum(int[][] second) {
        return (cols == second[0].length)
               && (rows == second.length);
    }

    @Override
    public int[][] sum(int[][] second) throws MatrixError {
        if(canSum(second)) {
            int[][] arr = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = macierz[i][j] + second[i][j];
                }
            }
            return  arr;
        }
        throw new MatrixError("You cant sum those matrix");
    }

    @Override
    public boolean canMultiply(int[][] second) {
        return cols == second.length;
    }

    @Override
    public int[][] multiply(int[][] second) throws MatrixError {
        if(canMultiply(second)) {
            int[][] arr = new int[rows][second[0].length];
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < second[0].length; j++) {
                    for(int k = 0; k < second.length; k++) {
                        arr[i][j] += macierz[i][k] * second[k][j];
                    }
                }
            }
            return arr;
        }
        throw new MatrixError("You cant multiply those matrix");
    }

    @Override
    public void print(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

public class Cw3 {
    public static void main(String[] args) throws MatrixError {
        Macierz macierz = new Macierz(new int[][] {
                {5, 6, 1, 0},
                {6, 2, 7, 2},
                {1, 3, 6, 2},
                {6, 3, 9, 2}
        });

        int[][] multiplyedArr = macierz.multiply(new int[][] {
                {8, 2, 1},
                {5, 1, 3},
                {8, 3, 1},
                {0, 1, 1}
        });
        macierz.print(multiplyedArr);
        System.out.println();
        int[][] sumArray = macierz.sum(new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        });
        macierz.print(sumArray);
        System.out.println();
        Macierz zerowa = new Macierz(5,5,"zerowa");
        zerowa.print(zerowa.macierz);
    }
}
