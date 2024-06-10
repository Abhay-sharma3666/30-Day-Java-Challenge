// Welcome to Day 7
// " Today, I tackled a problem involving a for Array multi dimensional. ”

/* Problem 1 : Write a program for a 2D array of size 3x3 and print the matrix.
 */
/* Problem 2 : Write a program for adding two matrices of the same size.
 */
/* Problem 3 : Write a program for the multiplication of two square matrices.
 */
/* Problem 4 : To find the transpose of a given matrix.
 */
/* Problem 5 : To calculate the determinant of a 3 x 3 matrix.
 */
/* Problem 6 : To check whether a given matrix is an identity matrix.
 */

import java.util.Scanner;
public class Day_7_Array_multi_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solving Problem 1
        /*int[][] arr1 = new int[3][3];
        // Prompt user for input
        System.out.println("\nRead a 2D array of size 3x3 and print the matrix :");
        System.out.println("------------------------------------------------------\n");

        // Input values for the matrix
        System.out.print("Input elements in the matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe matrix is : ");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.printf(arr1[i][j]+"\t");
        }*/
        // Solving Problem 2
        /*// Prompt user for input
        System.out.println("\n\nAddition of two Matrices :");
        System.out.println("------------------------------");
        System.out.print("Input the size of the square matrix (less than 5): ");
        int n = scanner.nextInt();

        int[][] arr1 = new int[n][n];
        int[][] brr1 = new int[n][n];
        int[][] crr1 = new int[n][n];

        // Input elements for the first matrix
        System.out.println("Input elements in the first matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second matrix
        System.out.println("Input elements in the second matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                brr1[i][j] = scanner.nextInt();
            }
        }

        // Display the first matrix
        System.out.println("\nThe First matrix is :");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.printf(arr1[i][j]+"\t");
        }

        // Display the second matrix
        System.out.println("\nThe Second matrix is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf(brr1[i][j]+"\t");
        }

        // Calculate the sum of the matrices
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                crr1[i][j] = arr1[i][j] + brr1[i][j];

        // Display the addition of two matrices
        System.out.println("\nThe Addition of two matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf(crr1[i][j]+"\t");
        }*/
        // Solving Problem 3
        /*// Display multiplication of two matrices
        System.out.println("\n\nMultiplication of two Matrices :");
        System.out.println("----------------------------------");

        // Input rows and columns of the first matrix
        System.out.print("\nInput the rows and columns of the first matrix: ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();

        // Input rows and columns of the second matrix
        System.out.print("\nInput the rows and columns of the second matrix: ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        // Check if multiplication is possible
        if (c1 != r2) {
            System.out.println("Multiplication of matrices is not possible.");
            System.out.println("Column of the first matrix and row of the second matrix must be the same.");
        } else {
            int[][] arr1 = new int[r1][c1];
            int[][] brr1 = new int[r2][c2];
            int[][] crr1 = new int[r1][c2];

            // Input elements in the first matrix
            System.out.println("Input elements in the first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                    arr1[i][j] = scanner.nextInt();
                }
            }

            // Input elements in the second matrix
            System.out.println("Input elements in the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                    brr1[i][j] = scanner.nextInt();
                }
            }

            // Display the first matrix
            System.out.println("\nThe First matrix is:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++)
                    System.out.printf(arr1[i][j]+"\t");
            }

            // Display the second matrix
            System.out.println("\nThe Second matrix is:");
            for (int i = 0; i < r2; i++) {;
                for (int j = 0; j < c2; j++)
                    System.out.printf(brr1[i][j]+"\t");
            }

            // Matrix multiplication
            for (int i = 0; i < r1; i++) { // Row of first matrix
                for (int j = 0; j < c2; j++) { // Column of second matrix
                    int sum = 0;
                    for (int k = 0; k < c1; k++)
                        sum = sum + arr1[i][k] * brr1[k][j];
                    crr1[i][j] = sum;
                }
            }

            // Display the result of matrix multiplication
            System.out.println("\nThe multiplication of two matrices is:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++)
                    System.out.printf(crr1[i][j]+"\t");
            }
        }*/
        // Solving Problem 4
        /*// Display transpose of a matrix
        System.out.println("\n\nTranspose of a Matrix :");
        System.out.println("---------------------------");

        // Input the rows and columns of the matrix
        System.out.print("\nInput the rows and columns of the matrix: ");
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] brr1 = new int[c][r];

        // Input elements in the matrix
        System.out.println("Input elements in the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < r; i++) {
            System.out.println();
            for (int j = 0; j < c; j++)
                System.out.printf(arr1[i][j]+"\t");
        }

        // Transpose of the matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Assigning transposed values to the new matrix
                brr1[j][i] = arr1[i][j];
            }
        }

        // Display the transpose of the matrix
        System.out.println("\n\nThe transpose of a matrix is : ");
        for (int i = 0; i < c; i++) {
            System.out.println();
            for (int j = 0; j < r; j++)
                System.out.printf(brr1[i][j]+"\t");
        }*/
        // Solving Problem 5
        /*// Display the purpose of the program
        System.out.println("\n\nCalculate the determinant of a 3 x 3 matrix :");
        System.out.println("-------------------------------------------------\n");

        // Input elements into the matrix
        System.out.println("Input elements in the matrix :");
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is :");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++)
                System.out.printf(arr1[i][j] +"\t");
        }

        // Calculate the determinant of the 3x3 matrix
        int det = 0;
        for (int i = 0; i < 3; i++) {
            det = det + (arr1[0][i] * (arr1[1][(i + 1) % 3] * arr1[2][(i + 2) % 3] - arr1[1][(i + 2) % 3] * arr1[2][(i + 1) % 3]));
        }

        // Display the determinant of the matrix
        System.out.printf("\nThe Determinant of the matrix is: "+ det);*/
        // Solving Problem 6
         /*// Display the purpose of the program
        System.out.println("\n\nCheck whether a given matrix is an identity matrix :");
        System.out.println("-----------------------------------------------------------");

        // Input the number of Rows for the matrix
        System.out.print("Input number of Rows for the matrix :");
        int r1 = scanner.nextInt();

        // Input the number of Columns for the matrix
        System.out.print("Input number of Columns for the matrix :");
        int c1 = scanner.nextInt();

        int[][] arr1 = new int[r1][c1];
        int yn = 1;

        // Input elements into the matrix
        System.out.println("Input elements in the matrix :");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                System.out.printf("element - " +"["+i+"]"+"["+j+"]"+" : ");
                arr1[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix
        System.out.println("The matrix is :");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1 ;j++) {
                System.out.printf(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        // Check whether the matrix is an identity matrix or not
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                if ((i == j && arr1[i][j] != 1) || (i != j && arr1[i][j] != 0)) {
                    yn = 0;
                    break;
                }
            }
            if (yn == 0) {
                break;
            }
        }

        // Display the result
        if(yn == 1) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }*/
    }
}
