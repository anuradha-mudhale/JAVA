package operations;

public class MatrixOperations {

    // Matrix class
    static class Matrix {
        private int rows;
        private int cols;
        private int[][] data;

        // Constructor
        public Matrix(int[][] data) {
            this.rows = data.length;
            this.cols = data[0].length;
            this.data = new int[rows][cols];

            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    this.data[i][j] = data[i][j];
        }

        // Matrix Addition
        public Matrix add(Matrix other) {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[i][j] = this.data[i][j] + other.data[i][j];
            return new Matrix(result);
        }

        // Matrix Subtraction
        public Matrix subtract(Matrix other) {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[i][j] = this.data[i][j] - other.data[i][j];
            return new Matrix(result);
        }

        // Matrix Multiplication
        public Matrix multiply(Matrix other) {
            int[][] result = new int[this.rows][other.cols];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < other.cols; j++) {
                    for (int k = 0; k < this.cols; k++) {
                        result[i][j] += this.data[i][k] * other.data[k][j];
                    }
                }
            }
            return new Matrix(result);
        }

        // Scalar Multiplication
        public Matrix scalarMultiply(int scalar) {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[i][j] = data[i][j] * scalar;
            return new Matrix(result);
        }

        // Scalar Division
        public Matrix scalarDivide(int scalar) {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[i][j] = data[i][j] / scalar;
            return new Matrix(result);
        }

        // Transpose
        public Matrix transpose() {
            int[][] result = new int[cols][rows];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    result[j][i] = data[i][j];
            return new Matrix(result);
        }

        // Display Matrix
        public void printMatrix() {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++)
                    System.out.print(data[i][j] + "\t");
                System.out.println();
            }
            System.out.println();
        }
    }

    // Main method to test matrix operations
    public static void main(String[] args) {
        int[][] data1 = {
            {1, 2},
            {3, 4}
        };

        int[][] data2 = {
            {5, 6},
            {7, 8}
        };

        Matrix m1 = new Matrix(data1);
        Matrix m2 = new Matrix(data2);

        System.out.println("Matrix 1:");
        m1.printMatrix();

        System.out.println("Matrix 2:");
        m2.printMatrix();

        System.out.println("Addition:");
        Matrix add = m1.add(m2);
        add.printMatrix();

        System.out.println("Subtraction:");
        Matrix sub = m1.subtract(m2);
        sub.printMatrix();

        System.out.println("Matrix Multiplication:");
        Matrix mul = m1.multiply(m2);
        mul.printMatrix();

        System.out.println("Scalar Multiplication (Matrix 1 * 2):");
        Matrix scalarMul = m1.scalarMultiply(2);
        scalarMul.printMatrix();

        System.out.println("Scalar Division (Matrix 2 / 2):");
        Matrix scalarDiv = m2.scalarDivide(2);
        scalarDiv.printMatrix();

        System.out.println("Transpose of Matrix 1:");
        Matrix trans1 = m1.transpose();
        trans1.printMatrix();

        System.out.println("Transpose of Matrix 2:");
        Matrix trans2 = m2.transpose();
        trans2.printMatrix();
    }
}
