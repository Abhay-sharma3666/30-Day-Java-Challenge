// Welcome to Day 6
// " Today, I tackled a problem involving a for Array. ”

/* Problem 1 : To find the second largest element in an array.
*/
/* Problem 2 : To print all unique elements in an array.
 */
/* Problem 3 : To count the total number of duplicate elements in an array.
 */
/* Problem 4 : To merge two arrays of the same size sorted in descending order.
 */
/* Problem 5 : To separate odd and even integers into separate arrays.
 */
/* Problem 6 : To sort elements of an array in ascending order.
 */
/* Problem 7 :  To delete an element at a desired position from an array.
 */
import java.util.Scanner;
import java.util.Arrays; // Import Arrays class
import java.util.Collections; // Import Collections class

public class Day_6_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solving Problem 1
           // Prompt user for input
        /*System.out.println("\nFind the second largest element in an array :");
        System.out.println("-------------------------------------------------");
        System.out.print("Input the size of the array : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
           //Input value for the array
        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }
           // Find the location of the largest element in the array
        int lrg = 0, j = 0;
        for (int i = 0; i < n; i++) {
            if (lrg < arr1[i]) {
                lrg = arr1[i];
                j = i;
            }
        }
            // Ignore the largest element and find the second largest element in the array
        int lrg2nd = 0;
        for (int i = 0; i < n; i++) {
            if (i == j) {
                continue;
            } else {
                if (lrg2nd < arr1[i]) {
                    lrg2nd = arr1[i];
                }
            }
        }
        System.out.println("The Second largest element in the array is :  " + lrg2nd + "\n\n");*/

        // Solving Problem 2
        /*System.out.println("\n\nPrint all unique elements of an array:");
        System.out.println("------------------------------------------");
        System.out.print("Input the number of elements to be stored in the array: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("\nThe unique elements found in the array are: ");
        for (int i = 0; i < n; i++) {
            int ctr = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr1[i] == arr1[j]) {
                        ctr++;
                    }
                }
            }
            if (ctr == 0) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println("\n\n");*/

        // Solving Problem 3
        /*System.out.print("Input the number of elements to be stored in the array :");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }

        int ctr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ctr++;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements found in the array: " + ctr);*/

        // Solving Problem 4
        /*System.out.println("\n\nMerge two arrays of same size sorted in descending order.");
        System.out.println("------------------------------------------------------------");

        System.out.print("Input the number of elements to be stored in the first array :");
        int s1 = scanner.nextInt();

        Integer[] arr1 = new Integer[s1];
        System.out.println("Input " + s1 + " elements in the array :");
        for (int i = 0; i < s1; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Input the number of elements to be stored in the second array :");
        int s2 = scanner.nextInt();

        Integer[] arr2 = new Integer[s2];
        System.out.println("Input " + s2 + " elements in the array :");
        for (int i = 0; i < s2; i++) {
            System.out.print("element - " + i + " : ");
            arr2[i] = scanner.nextInt();
        }

        Integer[] arr3 = new Integer[s1 + s2];
        System.arraycopy(arr1, 0, arr3, 0, s1);
        System.arraycopy(arr2, 0, arr3, s1, s2);

        Arrays.sort(arr3, Collections.reverseOrder()); // Sort the merged array in descending order

        System.out.println("\nThe merged array in descending order is :");
        for (int num : arr3) {
            System.out.print(num + "   "); // Print each element of the merged array
        }
        System.out.println("\n\n");*/

        // Solving Problem 5
        /*System.out.println("\n\nSeparate odd and even integers in separate arrays:");
        System.out.println("------------------------------------------------------");
        System.out.print("Input the number of elements to be stored in the array :");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }

        int[] arr2 = new int[n], arr3 = new int[n];
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[j++] = arr1[i];
            } else {
                arr3[k++] = arr1[i];
            }
        }

        System.out.println("\nThe Even elements are : ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\nThe Odd elements are :");
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\n\n");*/

        // Solving Problem 6
        /*System.out.println("\n\nSort elements of array in ascending order:");
        System.out.println("----------------------------------------------");
        System.out.print("Input the size of array : ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Input " + n + " elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[j] < arr1[i]) {
                    int tmp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }

        System.out.println("\nElements of array in sorted ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println("\n\n");*/

        // Solving Problem 7
        /*System.out.println("\n\nDelete an element at the desired position from an array:");
        System.out.println("---------------------------------------------------------");
        System.out.print("Input the size of the array : ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Input " + n + " elements in the array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr1[i] = scanner.nextInt();
        }

        System.out.print("\nInput the position where to delete: ");
        int pos = scanner.nextInt();

        for (int i = pos - 1; i < n - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        n--;

        System.out.println("\nThe new list is : ");
        for (int i = 0; i < n; i++) {
            System.out.print("  " + arr1[i]);
        }
        System.out.println("\n\n");*/
    }
}

