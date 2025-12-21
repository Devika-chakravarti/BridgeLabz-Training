class MatrixManipuationOperations{


    // This method creates a matrix with random values
    public static double[][] createRandomMatrix(int rows, int cols){
        // Creating a 2D array (matrix)
        double[][] matrix = new double[rows][cols];
        // Filling the matrix with random numbers between 1 and 9
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        // Returns the generated matrix
        return matrix;
    }



    // This method prints the matrix in row and column format
    public static void displayMatrix(double[][] matrix){
        // Loop for rows
        for(int i = 0; i < matrix.length; i++){
            // Loop for columns
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            // Move to next line after each row
            System.out.println();
        }
    }


    // This method finds the transpose of a matrix
    // Transpose means converting rows into columns
    public static double[][] transpose(double[][] matrix){
        // Creating a new matrix with swapped rows and columns
        double[][] t = new double[matrix[0].length][matrix.length];
        // Logic to swap rows and columns
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }



    // This method calculates determinant of a 2x2 matrix using Formula (a*d - b*c)
    public static double determinant2x2(double[][] m){
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }



    // This method calculates determinant of a 3x3 matrix
    public static double determinant3x3(double[][] m){
        // Using standard determinant formula for 3x3 matrix
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }



    // This method finds inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] m){
        // First calculate determinant
        double det = determinant2x2(m);
        // Creating inverse matrix
        double[][] inv = new double[2][2];
        // Applying inverse formula
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }



    // This method finds inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] m){
        // First calculate determinant
        double det = determinant3x3(m);
        // Creating inverse matrix
        double[][] inv = new double[3][3];
        // Calculating cofactors and dividing by determinant
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;
        return inv;
    }



    // Main method (execution starts from here)
    public static void main(String[] args){
        // Creating a random 2x2 matrix (input)
        System.out.println("2x2 Matrix:");
        double[][] m2 = createRandomMatrix(2, 2);
        displayMatrix(m2);

        // Finding and displaying transpose
        System.out.println("\nTranspose:");
        displayMatrix(transpose(m2));

        // Finding determinant
        System.out.println("\nDeterminant: " + determinant2x2(m2));

        // Finding inverse
        System.out.println("\nInverse:");
        displayMatrix(inverse2x2(m2));

        System.out.println();

        // Creating a random 3x3 matrix (input)
        System.out.println("\n3x3 Matrix:");
        double[][] m3 = createRandomMatrix(3, 3);
        displayMatrix(m3);

        // Finding transpose
        System.out.println("\nTranspose:");
        displayMatrix(transpose(m3));

        // Finding determinant
        System.out.println("\nDeterminant: " + determinant3x3(m3));

        // Finding inverse
        System.out.println("\nInverse:");
        displayMatrix(inverse3x3(m3));
    }


}
