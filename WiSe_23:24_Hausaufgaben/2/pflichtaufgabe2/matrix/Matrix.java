package matrix;

public class Matrix {
    public static int[][] transpose(int[][] matrix){
        //Hier soll die transpose-Methode implementiert werden.

        int[][] tMat = new int[matrix[0].length][matrix.length];

        for (int i = 0 ; i < tMat.length ; i++) {
            for (int j = 0 ; j < tMat[i].length ; j++) {
                tMat[i][j] = matrix[j][i];
            }
        }

        return tMat;
    }
    public static int[][] add(int[][] A, int[][] B){
        //Hier soll die Additions-Methode implementiert werden.
        
        if (A.length == B.length && A[0].length == B[0].length) {
            int[][] result = new int[A.length][A[0].length];

            for (int i = 0 ; i < A.length ; i++) {
                for (int j = 0 ; j < A[i].length ; j++) {
                    result[i][j] = A[i][j] + B[i][j];
                }
            }
            return result;
        } else {
            System.out.println("The matrix indexs are not same with each other!");
            return new int[][] {{}};
        }
    }

    public static int[][] mult(int[][] A, int[][] B){
        //Hier soll die Multiplikations-Methode implementiert werden.
        
        if (A[0].length == B.length) {
            int[][] result = new int[A.length][B[0].length];

            for (int i = 0 ; i < A.length ; i++) {
                for (int j = 0 ; j < B[0].length ; j++) {
                    for (int k = 0; k < B.length ; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return result;
        } else {
            System.out.println("The matrix indexs are not same with each other!");
            return new int[][]{};
        }
    }
    
    public static void print(int[][] matrix){
        //Hier soll die print-Methode implementiert werden.
        
        for (int i = 0 ; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}