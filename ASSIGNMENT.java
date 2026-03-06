import java.util.Scanner;

 public class ASSIGNMENT{
         public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          
        System.out.print("Enter size of square matrix: ");
        int y = input.nextInt();

        int[][] matrix = new int[y][y];
          
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < y; i++) {           
            for (int j = 0; j < y ; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < y; i++) {
            int rowSum = 0;

            for (int j = 0; j < y; j++) {
                rowSum = rowSum + matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < y; j++) {
            int colSum = 0;

            for (int i = 0; i < y; i++) {
                colSum = colSum + matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

        int diagonalSum = 0;

        for (int i = 0; i < y; i++) {
            diagonalSum = diagonalSum + matrix[i][i];
        }

        
          System.out.println("\nSum of diagonal elements = " + diagonalSum);
        int reverseDiagonalSum = 0;

        for (int i = 0; i < y; i++) {
            reverseDiagonalSum = reverseDiagonalSum + matrix[i][y - 1 - i];
        }

        System.out.println("Sum of reverse diagonal elements = " + reverseDiagonalSum);

    }
}
    


