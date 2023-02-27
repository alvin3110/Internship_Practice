import java.util.Scanner;
class Matricemultiplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows of the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int c1 = sc.nextInt();
        
       
        System.out.print("Enter the number of rows of the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("The matrices cannot be multiplied.");
            return;
        }
        
        // Create the matrices and initialize their elements
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The result of the multiplication is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j <c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
