import java.util.Scanner;
  class Matrixlowertriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the dimensions of the matrix
        System.out.print("Enter the number of rows and columns of the matrix: ");
        int n = sc.nextInt();
        
        // Create the matrix and initialize its elements
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Display the lower triangular matrix
        System.out.println("The lower triangular matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
