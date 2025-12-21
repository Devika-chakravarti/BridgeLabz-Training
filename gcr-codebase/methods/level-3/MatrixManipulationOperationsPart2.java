public class MatrixManipulationOperationsPart2{


    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols){
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
		// random values 0–9
                matrix[i][j] = (int)(Math.random() * 10);    
	    }
        }
        return matrix;
    }


    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b){
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }


    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b){
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }


    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b){
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                for(int k = 0; k < common; k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }


    // Method to print a matrix
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    // Main method
    public static void main(String[] args){
        int rows = 3;
        int cols = 3;
        // Create random matrices
        int[][] matrixA = createRandomMatrix(rows,cols);
        int[][] matrixB = createRandomMatrix(rows,cols);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
	    System.out.println();

        System.out.println("Matrix B:");
        printMatrix(matrixB);
	    System.out.println();

        // Addition
        System.out.println("Matrix Addition:");
        printMatrix(addMatrices(matrixA,matrixB));
	    System.out.println();

        // Subtraction
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractMatrices(matrixA,matrixB));
	    System.out.println();

        // Multiplication
        System.out.println("Matrix Multiplication:");
        printMatrix(multiplyMatrices(matrixA,matrixB));
    }

}
