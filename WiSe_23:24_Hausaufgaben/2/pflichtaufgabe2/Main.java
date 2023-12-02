import matrix.Matrix;

public class Main {

    public static void main(String[] args) {
        /*
         * Ab hier soll die main-Methode implementiert werden.
         * Methoden aus Matrix.java können mit Matrix.Methodennamen(...) aufgerufen werden.
         */

        int[][] a = { {1,2} , {2,3} , {3,4} };
        int[][] b = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16} };
        int[][] c = { {1,2,3,4} , {5,6,7,8} };

        System.out.println("Transformed matrix A : \n");

        Matrix.print(Matrix.transpose(a));

        System.out.println("\nA times B matrix : \n");

        Matrix.print(Matrix.mult(a , b));

        System.out.println("\nB plus B matrix : \n");

        Matrix.print(Matrix.add(b , b));

        System.out.println("\nA times C matrix : \n");

        Matrix.print(Matrix.mult(a , c));
    }
}